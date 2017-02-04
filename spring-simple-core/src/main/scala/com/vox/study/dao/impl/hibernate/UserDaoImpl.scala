package com.vox.study.dao.impl.hibernate

import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.orm.hibernate4.support.HibernateDaoSupport
import org.springframework.stereotype.Repository

import com.vox.study.dao.UserDao
import com.vox.study.domain.User

/**
 * @author cielleech
 */
@Repository
class UserDaoImpl extends HibernateDaoSupport with UserDao {
  @Autowired
  def this(sessionFactory: SessionFactory) = {
    this
    super.setSessionFactory(sessionFactory)
  }

  def getUser(id: Long): User = {
    this.getHibernateTemplate.get(classOf[User], 1L)
  }
}