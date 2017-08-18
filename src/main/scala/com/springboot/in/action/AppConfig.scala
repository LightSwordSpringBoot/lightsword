package com.springboot.in.action

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@SpringBootApplication
@ServletComponentScan(basePackages = Array("com.springboot.in.action"))
class AppConfig
