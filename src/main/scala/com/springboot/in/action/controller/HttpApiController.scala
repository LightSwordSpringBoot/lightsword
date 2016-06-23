package com.springboot.in.action.controller

import java.util.Date
import java.util.concurrent.CountDownLatch

import com.alibaba.fastjson.JSON
import com.springboot.in.action.dao.{HttpApiDao, HttpReportDao, HttpSuiteDao}
import com.springboot.in.action.engine.OkHttp
import com.springboot.in.action.entity.{HttpApi, HttpReport}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, RequestParam, ResponseBody, RestController}
import org.springframework.web.servlet.ModelAndView
import scala.collection.JavaConversions._

@RestController
@RequestMapping(Array("/httpapi"))
class HttpApiController @Autowired() (
    val HttpSuiteDao: HttpSuiteDao,
    val HttpApiDao: HttpApiDao,
    val HttpReportDao: HttpReportDao) {

  @RequestMapping(value = {
    Array("", "/")
  }, method = Array(RequestMethod.GET))
  def list(model: Model) = {
    model.addAttribute("httpapis", HttpApiDao.findAll())
    new ModelAndView("/httpapi/list")
  }

  @RequestMapping(value = {
    Array("/json")
  }, method = Array(RequestMethod.GET))
  def listJson() = HttpApiDao.findAll()

  @RequestMapping(value = {
    Array("/listHttpSuiteTestCase")
  }, method = Array(RequestMethod.GET))
  def listHttpSuiteTestCase(model: Model, @RequestParam(value = "httpSuiteId") httpSuiteId: Integer) = {
    var httpapis = HttpApiDao.listByHttpSuiteId(httpSuiteId)
    model.addAttribute("httpapis", httpapis)
    model.addAttribute("httpSuiteId", httpSuiteId)
    model.addAttribute("httpSuiteName", HttpSuiteDao.findOne(httpSuiteId).name)
    new ModelAndView("/httpapi/listHttpSuiteTestCase")
  }

  @RequestMapping(value = {
    Array("/listHttpSuiteTestCaseJson")
  },
    method = Array(RequestMethod.GET))
  @ResponseBody
  def listHttpSuiteTestCaseJson(model: Model, @RequestParam(value = "httpSuiteId") httpSuiteId: Integer) = {
    HttpApiDao.listByHttpSuiteId(httpSuiteId)
  }

  @RequestMapping(Array("/newPage/{httpSuiteId}"))
  def goNewPage(@PathVariable(value = "httpSuiteId") httpSuiteId: Integer, model: Model) = {
    model.addAttribute("httpSuiteId", httpSuiteId)
    model.addAttribute("httpSuiteName", HttpSuiteDao.findOne(httpSuiteId).name)
    new ModelAndView("/httpapi/new")
  }

  /**
   * 项目下面的用例编辑
   */
  @RequestMapping(Array("/editPage/{caseId}"))
  def goEditPage(model: Model, @PathVariable(value = "caseId") caseId: Integer, @RequestParam(value = "httpSuiteId") httpSuiteId: Integer) = {
    val httpapi = HttpApiDao.findOne(caseId)
    model.addAttribute("httpapi", httpapi)
    model.addAttribute("httpSuiteId", httpSuiteId)
    model.addAttribute("httpSuiteName", HttpSuiteDao.findOne(httpSuiteId).name)
    new ModelAndView("/httpapi/edit")
  }

  @RequestMapping(Array("/copyPage/{caseId}"))
  def goCopyPage(model: Model, @PathVariable(value = "caseId") caseId: Integer, @RequestParam(value = "httpSuiteId") httpSuiteId: Integer) = {
    val httpapi = HttpApiDao.findOne(caseId)
    model.addAttribute("httpapi", httpapi)
    model.addAttribute("httpSuiteId", httpSuiteId)
    model.addAttribute("httpSuiteName", HttpSuiteDao.findOne(httpSuiteId).name)
    new ModelAndView("/httpapi/copy")
  }

  @RequestMapping(Array("/detailPage/{id}"))
  def goDetailPage(model: Model, @PathVariable(value = "id") id: Integer) = {
    val httpapi = HttpApiDao.findOne(id)
    model.addAttribute("httpapi", httpapi)
    new ModelAndView("/httpapi/detail")
  }

  @RequestMapping(value = Array("/postnew"),
    method = Array(RequestMethod.POST))
  @ResponseBody
  def newOne(@RequestParam(value = "httpSuiteId") httpSuiteId: Integer,
    @RequestParam(value = "name") name: String,
    @RequestParam(value = "url") url: String,
    @RequestParam(value = "method") method: String,
    @RequestParam(value = "paramJsonStr") paramJsonStr: String,
    @RequestParam(value = "expectOutput") expectOutput: String,
    @RequestParam(value = "actualOutput") actualOutput: String,
    @RequestParam(value = "owner") owner: String) = {
    val httpapi = new HttpApi()
    httpapi.httpSuiteId = httpSuiteId
    httpapi.name = name
    httpapi.url = url
    httpapi.method = method
    httpapi.paramJsonStr = paramJsonStr
    httpapi.expectOutput = expectOutput
    httpapi.actualOutput = actualOutput
    httpapi.runTimes = 0
    httpapi.state = -1
    httpapi.owner = owner
    httpapi.gmtCreate = new Date()
    httpapi.gmtModify = new Date()
    HttpApiDao.save(httpapi)
  }

  @RequestMapping(value = Array("/postedit"),
    method = Array(RequestMethod.POST))
  @ResponseBody
  def editOne(@RequestParam(value = "id") id: Integer,
    @RequestParam(value = "name") name: String,
    @RequestParam(value = "url") url: String,
    @RequestParam(value = "method") method: String,
    @RequestParam(value = "paramJsonStr") paramJsonStr: String,
    @RequestParam(value = "expectOutput") expectOutput: String) = {
    val httpapi = HttpApiDao.findOne(id)
    httpapi.name = name
    httpapi.url = url
    httpapi.method = method
    httpapi.paramJsonStr = paramJsonStr
    httpapi.expectOutput = expectOutput
    httpapi.gmtModify = new Date()
    HttpApiDao.save(httpapi)
  }

  /**
   * 在新建用例页面,调试用例用
   */
  @RequestMapping(value = Array("/debugTest"),
    method = Array(RequestMethod.GET))
  @ResponseBody
  def debugTest(@RequestParam(value = "url") url: String,
    @RequestParam(value = "method") method: String,
    @RequestParam(value = "paramJsonStr") paramJsonStr: String) = {
    OkHttp.run(url, method, paramJsonStr)
  }

  /**
   * 执行用例
   */
  @RequestMapping(value = Array("/runTest"),
    method = Array(RequestMethod.GET))
  @ResponseBody
  def debugTest(@RequestParam(value = "id") id: Integer) = { runTestCase(id) }

  /**
   * 回归项目全部用例,每个用例单独起一个线程跑
   */
  @RequestMapping(value = Array("/testHttpSuite"),
    method = Array(RequestMethod.GET))
  @ResponseBody
  def testProject(@RequestParam(value = "httpSuiteId") httpSuiteId: Integer) = {
    val caseIds = HttpApiDao.listTestCaseId(httpSuiteId)

    val threads = caseIds.size
    val countDownLatch = new CountDownLatch(threads)

    for (cid <- caseIds) {
      val t = new TestCaseRunner(cid, countDownLatch)
      t.start
    }
    println("回归测试开始......")
    countDownLatch.await // now waiting sub thread done.
    println("回归测试结束!")
    val HttpReport = getHttpReport(httpSuiteId)
    // 保存测试结果
    HttpReportDao.save(HttpReport)
    HttpReport
  }

  def getHttpReport(httpSuiteId: Integer) = {
    println("自动化回归测试报告:")

    val p = HttpSuiteDao.findOne(httpSuiteId)
    val httpSuiteName = p.name
    val pass = HttpApiDao.countPass(httpSuiteId)
    val fail = HttpApiDao.countFail(httpSuiteId)

    val HttpReport = new HttpReport
    HttpReport.httpSuiteId = httpSuiteId
    HttpReport.httpSuiteName = httpSuiteName
    HttpReport.pass = pass
    HttpReport.fail = fail
    HttpReport.time = new Date
    println(JSON.toJSONString(HttpReport, true))
    HttpReport
  }

  /**
   * 执行caseId这个用例
   */

  def runTestCase(id: Integer) = {
    val tc = HttpApiDao.findOne(id)
    val url = tc.url
    val method = tc.method
    val paramJsonStr = tc.paramJsonStr
    println("接口url:" + url)
    println("方法:" + method)
    println("输入参数:" + paramJsonStr)

    val result = OkHttp.run(url, method, paramJsonStr)
    //执行次数+1
    tc.runTimes = tc.runTimes + 1
    println("实际输出:" + result)
    tc.actualOutput = result
    // 结果断言
    val expectOutput = tc.expectOutput
    val contains = result.contains(expectOutput)
    tc.state = if (contains) 1 else 0
    // 执行事件
    tc.gmtModify = new Date
    HttpApiDao.save(tc)
  }

  /**
   * TestCaseRunner
   */
  class TestCaseRunner(val caseId: Integer, val countDownLatch: CountDownLatch) extends Thread {

    override def run() {
      runTestCase(caseId)
      countDownLatch.countDown
    }
  }
}