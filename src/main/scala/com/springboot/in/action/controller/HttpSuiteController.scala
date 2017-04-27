package com.springboot.in.action.controller

import com.springboot.in.action.dao.HttpSuiteDao
import com.springboot.in.action.entity.HttpSuite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.ui.Model
import org.springframework.web.bind.annotation._
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping(Array("/httpsuite"))
class HttpSuiteController @Autowired()(val HttpSuiteDao: HttpSuiteDao) {

  @PreAuthorize("hasAnyRole('ADMIN','USER')")
  @RequestMapping(value = {
    Array("", "/")
  })
  def list(model: Model) = {
    val HttpSuites = HttpSuiteDao.findAll
    model.addAttribute("HttpSuites", HttpSuites)
    new ModelAndView("/httpsuite/list")
  }

  @RequestMapping(Array("/newPage"))
  def goNewPage() = {
    new ModelAndView("/httpsuite/new")
  }


  @RequestMapping(value = Array("/postnew"), method = Array(RequestMethod.POST))
  @ResponseBody
  def newOne(@RequestParam(value = "name") name: String) = {
    val p = new HttpSuite
    p.name = name
    HttpSuiteDao.save(p)
  }

}
