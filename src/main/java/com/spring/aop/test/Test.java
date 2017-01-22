package com.spring.aop.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.service.AService;

@ContextConfiguration(locations="classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
	@Autowired
	private AService aService;
	
	@org.junit.Test
	public void testAService(){
		aService.barA();
	}

}