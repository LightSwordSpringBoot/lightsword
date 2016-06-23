package com.springboot.in.action.controller

import com.springboot.in.action.dao.HttpReportDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping(Array("/httpreport"))
class HttpReportController @Autowired() (val HttpReportDao: HttpReportDao) {

  @RequestMapping(value = { Array("", "/") })
  def list(model: Model) = {
    val reports = HttpReportDao.findAll
    model.addAttribute("reports", reports)
    new ModelAndView("/httpreport/list")
  }

}