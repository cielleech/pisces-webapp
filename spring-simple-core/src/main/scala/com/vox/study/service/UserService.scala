package com.vox.study.service

import com.vox.study.domain.User

trait UserService {
  def getUser(id: Long): User
}