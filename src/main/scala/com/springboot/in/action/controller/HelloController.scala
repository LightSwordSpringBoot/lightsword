package com.springboot.in.action.controller

import java.util.Date

import com.alibaba.fastjson.JSONObject
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, RestController}

/**
 * Created by jack on 16/6/24.
 *
 * 系统内部测试用
 */

@RestController
class HelloController {

  @RequestMapping(Array("/hello"))
  def greeting(@RequestParam(value="name", defaultValue="LightSword")  name: String) = {
    val now = new Date
    val content =  "Hello, " + name + "! Now is: " + now

    val json = new JSONObject
    json.put("conent", content)

    json

  }

}
