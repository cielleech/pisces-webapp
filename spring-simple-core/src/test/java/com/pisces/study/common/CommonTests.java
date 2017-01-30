package com.pisces.study.common;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vox.study.domain.User;
import com.vox.study.service.UserService;

/**
 * 
 * @author cielleech
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/vox-servlet.xml", "classpath:config/spring/vox-mybatis.xml" })
public class CommonTests {
	@Resource
	private UserService service;
	
	@Test
	public void getUserTest() {
		User user = service.getUser(1L);
		Assert.assertEquals(1L, user.getId().longValue());
	}
	
    @Test
    public void printTest() {
        System.out.println("Hello world!");
    }
}