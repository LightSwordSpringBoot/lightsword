package com.springboot.in.action.service

import java.util

import com.springboot.in.action.dao.{RoleDao, UserDao, UserRoleDao}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.{User, UserDetails, UserDetailsService, UsernameNotFoundException}
import org.springframework.stereotype.Service
import org.springframework.util.StringUtils


/**
  * Created by jack on 2017/4/29.
  */
@Service
class LightSwordUserDetailService extends UserDetailsService {

  @Autowired var userRoleDao: UserRoleDao = _
  @Autowired var userDao: UserDao = _
  @Autowired var roleDao: RoleDao = _


  override def loadUserByUsername(username: String): UserDetails = {

//    val user = userDao.findByUsername(username) // 直接调用jpa自动生成的方法
    val user = userDao.getUserByUsername(username)
    if (user == null) throw new UsernameNotFoundException(username + " not found")

    val authorities = new util.ArrayList[SimpleGrantedAuthority]
    val userRoles = userRoleDao.listByUserId(user.id)

    // Scala中调用java的collection类，使用scala的foreach，编译器会提示无法找到result的foreach方法。因为这里的userRoles的类型为java.util.List。若要将其转换为Scala的集合，就需要增加如下语句：
    import scala.collection.JavaConversions._
    for (userRole <- userRoles) {
      val roleId = userRole.roleId
      val roleName = roleDao.findOne(roleId).role
      if (!StringUtils.isEmpty(roleName)) {
        authorities.add(new SimpleGrantedAuthority(roleName))
      }

      System.err.println("username is " + username + ", " + roleName)
    }

    new User(username, user.password, authorities)
  }
}
