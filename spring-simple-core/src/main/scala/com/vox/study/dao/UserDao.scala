package com.vox.study.dao

import com.vox.study.domain.User

trait UserDao {
  def getUser(id: Long): User
}