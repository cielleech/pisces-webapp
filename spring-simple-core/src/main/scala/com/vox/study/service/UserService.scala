package com.vox.study.service

import com.vox.study.domain.User

/**
 * @author cielleech
 */
trait UserService {
  def getUser(id: Long): User
}