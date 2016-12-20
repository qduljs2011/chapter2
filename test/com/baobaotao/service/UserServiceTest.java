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
public class UserServiceTest {
	private TUser user;
	@Before
	public void setUp() throws Exception {
		System.out.println("初始化方法");
		user=null;
	}
	@Test(expected=NullPointerException.class,timeout=10)
	public void method1(){
		//System.out.println("exception");
		assertNotNull(user.getUserName());
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

}
