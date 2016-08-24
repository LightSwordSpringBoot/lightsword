package com.springboot.in.action.controller

import java.util.Date

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.web.servlet.ModelAndView

/**
  * Created by jack on 16/6/24.
  *
  * 系统内部测试用
  */

@RestController
@RequestMapping(Array("/angular"))
class AngularController {

  @RequestMapping(Array("/hello"))
  def greeting(model: Model) = {
    val now = new Date
    val content = "Hello, ! Now is: " + now
    model.addAttribute("content", content)
    new ModelAndView("/angular/hello")
  }

  @RequestMapping(Array("/filter"))
  def filter(model: Model) = {
    new ModelAndView("/angular/filter")
  }

}
