package com.springboot.in.action.entity

import java.util.Date
import javax.persistence.{ Entity, GeneratedValue, GenerationType, Id }
import scala.language.implicitConversions
import scala.beans.BeanProperty

@Entity
class HttpSuite {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Integer = _
  
  @BeanProperty
  var name: String = _
  

}