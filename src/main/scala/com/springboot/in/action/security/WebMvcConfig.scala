package com.springboot.in.action.security

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{ViewControllerRegistry, WebMvcConfigurerAdapter}


/**
  * Created by jack on 2017/4/30.
  */
@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {
  /**
    * 统一注册纯RequestMapping跳转View的Controller
    */
  override def addViewControllers(registry: ViewControllerRegistry) {
    registry.addViewController("/login").setViewName("/login")
    registry.addViewController("/403").setViewName("/403")
  }
}
