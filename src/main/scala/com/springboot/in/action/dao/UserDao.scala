package com.springboot.in.action.dao

import java.util.List

import com.springboot.in.action.entity.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

import scala.language.implicitConversions

trait UserDao extends CrudRepository[User, Integer] {
  def findAll(): List[User] // JavaConversions

  def save(u: User): User

  def findOne(id: Integer): User

  @Query(value = "select * from `user` where `username` = ?1 limit 1", nativeQuery = true)
  def getUserByUsername(username: String): User

  def findByUsername(username: String): User


}
