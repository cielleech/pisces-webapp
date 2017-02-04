package org.vox.study.dao

import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration
import javax.annotation.Resource
import com.vox.study.dao.UserDao
import org.junit.Test

/**
 * @author cielleech
 */
@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(locations = Array("classpath:config/spring/vox-servlet.xml", "classpath:config/spring/vox-dataSource.xml", "classpath:config/spring/vox-hibernate.xml"))
class UserDaoTests {
  @Resource
  var dao: UserDao = _

  @Test
  def getTest(): Unit = {
    val user = dao.getUser(1L)
  }
}