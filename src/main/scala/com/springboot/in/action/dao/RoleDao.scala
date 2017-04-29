package com.springboot.in.action.dao

import java.util.List

import com.springboot.in.action.entity.Role
import org.springframework.data.repository.CrudRepository

import scala.language.implicitConversions

trait RoleDao extends CrudRepository[Role, Integer] {

  def findOne(id: Integer): Role

  def findAll(): List[Role] // JavaConversions

  def save(r: Role): Role


}
