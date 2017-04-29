package com.springboot.in.action.dao

import java.util.List

import com.springboot.in.action.entity.UserRole
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

import scala.language.implicitConversions

trait UserRoleDao extends CrudRepository[UserRole, Integer] {
  def findAll(): List[UserRole] // JavaConversions

  def save(u: UserRole): UserRole

  def findOne(id: Integer): UserRole

  @Query(value = "SELECT * FROM user_role where user_id = ?1", nativeQuery = true)
  def listByUserId(userId: Integer): List[UserRole]


}
