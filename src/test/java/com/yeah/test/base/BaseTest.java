package com.yeah.test.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml", "classpath:spring-service.xml" })
public class BaseTest {
	@Test
	public void test() {
		// 防止报错：no runnable methods
	}
}