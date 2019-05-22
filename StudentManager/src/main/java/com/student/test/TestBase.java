package com.student.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBase {

	protected ClassPathXmlApplicationContext ac;
	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("spring/spring-config.xml");
	}
	
	@Test
	public void test() {
		System.out.println(ac);
	}
	
	@After
	public void close() {
		ac.close();
	}
}
