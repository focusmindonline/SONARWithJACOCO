package com.pak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pak.controller.MessageController;

@SpringBootTest
class SonarqubeJacocoDemoApplicationTests {

	@Autowired
	private MessageController controller;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testGetMessage() {
		String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}
}
