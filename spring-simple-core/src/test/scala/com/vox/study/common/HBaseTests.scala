package com.vox.study.common

import javax.annotation.Resource

import org.apache.hadoop.hbase.client.{HTableInterface, Put}
import org.apache.hadoop.hbase.util.Bytes
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.data.hadoop.hbase.{HbaseTemplate, TableCallback}
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(locations = Array("classpath:config/spring/vox-servlet.xml", "classpath:config/spring/vox-dataSource.xml", "classpath:config/spring/vox-hibernate.xml", "classpath:config/spring/vox-redis.xml", "classpath:config/spring/vox-hbase.xml"))
class HBaseTests {
  @Resource
  var template: HbaseTemplate = _

  def getTest(): Unit = {

  }

  @Test
  def insertTest(): Unit = {
    template.execute("user", new TableCallback[Object] {
      override def doInTable(table: HTableInterface): Object = {
        val put = new Put(Bytes.toBytes("1234"))
        put.add(Bytes.toBytes("id"), Bytes.toBytes("primaryId"), Bytes.toBytes("1234"))
        table.put(put)
        null
      }
    })
  }
}