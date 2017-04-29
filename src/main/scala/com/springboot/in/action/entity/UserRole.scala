package com.springboot.in.action.entity

import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty

/**
  * Created by jack on 2017/4/29.
  */
@Entity
class UserRole {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var userId: Integer = _
  @BeanProperty
  var roleId: Integer = _


}
