package com.springboot.in.action.advice

import org.springframework.web.bind.annotation.{ControllerAdvice, ExceptionHandler}
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.ModelAndView

/**
  * Created by jack on 2017/4/27.
  */
@ControllerAdvice
class GlobalExceptionHandlerAdvice {

  @ExceptionHandler(value = Array(classOf[Exception])) //表示捕捉到所有的异常，你也可以捕捉一个你自定义的异常
  def exception(exception: Exception, request: WebRequest): ModelAndView = {
    val modelAndView = new ModelAndView("/error") //error页面
    modelAndView.addObject("errorMessage", exception.getMessage)
    modelAndView.addObject("stackTrace", exception.getStackTrace)
    modelAndView
  }

}
