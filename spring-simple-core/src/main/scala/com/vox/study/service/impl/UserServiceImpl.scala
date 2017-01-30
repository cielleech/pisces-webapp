package com.vox.study.service.impl

import com.vox.study.service.UserService
import com.vox.study.domain.User
import org.springframework.stereotype.Service
import javax.annotation.Resource
import com.vox.study.dao.UserDao

@Service
class UserServiceImpl extends UserService {
  @Resource
  var dao: UserDao = _
  
  def getUser(id: Long): User = {
    dao.getUser(1L)
  }
}