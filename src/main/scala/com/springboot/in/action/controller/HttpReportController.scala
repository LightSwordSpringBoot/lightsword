package com.springboot.in.action.controller

import java.util

import com.alibaba.fastjson.serializer.SerializerFeature
import com.springboot.in.action.dao.HttpReportDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.web.servlet.ModelAndView

import scala.collection.JavaConversions._

@RestController
@RequestMapping(Array("/httpreport"))
class HttpReportController @Autowired()(val HttpReportDao: HttpReportDao) {

  @RequestMapping(value = {
    Array("", "/")
  })
  @PreAuthorize("hasRole('ADMIN')") // Spring Security默认的角色前缀是”ROLE_”,使用hasRole方法时已经默认加上了
  def list(model: Model) = {
    val reports = HttpReportDao.findAll
    model.addAttribute("reports", reports)

    val rateList = new util.ArrayList[Double]

    val trendList = new util.ArrayList[Object]

    for (r <- reports) {
      rateList.add(r.rate)

      // QualityTrend
      val qt = new util.HashMap[String, Any]

      qt.put("id", r.id)
      qt.put("failed", r.fail)
      qt.put("totalCases", r.pass + r.fail)
      qt.put("rate", r.rate)
      trendList.add(qt)
    }

    val jsonstr = com.alibaba.fastjson.JSON.toJSONString(trendList, SerializerFeature.BrowserCompatible)
    println(jsonstr)

    model.addAttribute("rateList", rateList)
    model.addAttribute("trendList", jsonstr)

    new ModelAndView("/httpreport/list")
  }

}
