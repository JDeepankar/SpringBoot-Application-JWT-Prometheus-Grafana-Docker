package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	
	public static Log logger = LogFactory.getLog(DemoApplication.class);

	@Test
	public void contextLoads() {
		logger.info("Application is in test class");
		assertEquals(true, true);
	}

}
