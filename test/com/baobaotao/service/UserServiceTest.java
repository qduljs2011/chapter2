package com.baobaotao.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baobaotao.domain.TUser;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void hasMatchUser(){
		boolean b1=userService.hasMatcher("123", "123");
		boolean b2=userService.hasMatcher("admin", "1111");
		assertTrue(b1);
		assertTrue(!b2);
		
	}
	@Test
	public void findByUserByName(){
		TUser user=userService.getUserByName("admin");
		assertTrue(user.getUserName().endsWith("admin"));
	}
}
