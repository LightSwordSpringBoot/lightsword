package com.springboot.in.action.filter

import javax.servlet._
import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletRequest

import org.springframework.core.annotation.Order

/**
  * Created by jack on 2017/4/28.
  */
@Order(1) //@Order注解表示执行过滤顺序，值越小，越先执行
@WebFilter(filterName = "loginFilter", urlPatterns = Array("/*")) //需要在spring-boot的入口处加注解@ServletComponentScan, 如果不指定，默认url-pattern是/*
class LoginFilter extends Filter {
  override def init(filterConfig: FilterConfig): Unit = {}

  override def destroy(): Unit = {}

  override def doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain): Unit = {
    val session = request.asInstanceOf[HttpServletRequest].getSession

    import org.springframework.security.core.context.SecurityContextHolder
    import org.springframework.security.core.userdetails.UserDetails

    val principal = SecurityContextHolder.getContext.getAuthentication.getPrincipal

    var username = ""
    if (principal.isInstanceOf[UserDetails]) {
      username = principal.asInstanceOf[UserDetails].getUsername
    }
    else {
      username = principal.toString
    }
    session.setAttribute("username", username)

    chain.doFilter(request, response)
  }
}
