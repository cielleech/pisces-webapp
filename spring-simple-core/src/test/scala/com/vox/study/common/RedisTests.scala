package com.vox.study.common

import javax.annotation.Resource

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
  * @author cielleech
  */
@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(locations = Array("classpath:config/spring/vox-servlet.xml", "classpath:config/spring/vox-dataSource.xml", "classpath:config/spring/vox-hibernate.xml", "classpath:config/spring/vox-redis.xml"))
class RedisTests {
  @Resource
  var redisTemplate: RedisTemplate[String, String] = _

  @Test
  def getTest(): Unit = {
    println(redisTemplate.opsForValue().get("1234"))
  }

  @Test
  def setTest(): Unit = {
    redisTemplate.opsForValue().set("1234", "234")
  }
}