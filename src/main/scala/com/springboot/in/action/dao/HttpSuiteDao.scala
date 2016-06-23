package com.springboot.in.action.dao

import java.util.List

import com.springboot.in.action.entity.HttpSuite
import org.springframework.data.repository.CrudRepository

trait HttpSuiteDao extends CrudRepository[HttpSuite, Integer] {
  def findAll(): List[HttpSuite] // JavaConversions

  def save(t: HttpSuite): HttpSuite

  def findOne(id: Integer): HttpSuite

}