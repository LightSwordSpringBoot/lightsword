package com.springboot.in.action.service

import java.util.UUID
import javax.annotation.PostConstruct

import com.springboot.in.action.dao.{RoleDao, UserDao, UserRoleDao}
import com.springboot.in.action.entity.{Role, User, UserRole}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
  * Created by jack on 2017/4/29.
  * 初始化测试数据
  */
@Service // 需要初始化数据时，打开注释即可。
class DataInit @Autowired()(val userDao: UserDao,
                            val userRoleDao: UserRoleDao,
                            val roleDao: RoleDao) {

  @PostConstruct def dataInit(): Unit = {
    val uuid = UUID.randomUUID().toString

    val admin = new User
    val jack = new User

    admin.username = "admin_" + uuid
    admin.password = "admin"

    jack.username = "jack_" + uuid
    jack.password = "123456"

    userDao.save(admin)
    userDao.save(jack)

    val adminRole = new Role
    val userRole = new Role

    adminRole.role = "ROLE_ADMIN"
    userRole.role = "ROLE_USER"

    roleDao.save(adminRole)
    roleDao.save(userRole)

    val userRoleAdminRecord1 = new UserRole
    userRoleAdminRecord1.userId = admin.id
    userRoleAdminRecord1.roleId = adminRole.id
    userRoleDao.save(userRoleAdminRecord1)

    val userRoleAdminRecord2 = new UserRole
    userRoleAdminRecord2.userId = admin.id
    userRoleAdminRecord2.roleId = userRole.id
    userRoleDao.save(userRoleAdminRecord2)

    val userRoleJackRecord = new UserRole
    userRoleJackRecord.userId = jack.id
    userRoleJackRecord.roleId = userRole.id
    userRoleDao.save(userRoleJackRecord)


  }

}
