package com.springboot.in.action.entity

import java.util.Date
import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty
import scala.language.implicitConversions

@Entity
class HttpReport {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Integer = _

  @BeanProperty
  var httpSuiteId: Integer = _

  @BeanProperty
  var httpSuiteName: String = _

  @BeanProperty
  var pass: Integer = _

  @BeanProperty
  var fail: Integer = _

  /**
    * 通过率 rate %
    */
  @BeanProperty
  var rate: Double = _

  @BeanProperty
  var time: Date = _

}
