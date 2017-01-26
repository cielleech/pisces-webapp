package com.vox.study.dao

import com.vox.study.domain.User

trait UserDao {
  def get(id: Long): User
}