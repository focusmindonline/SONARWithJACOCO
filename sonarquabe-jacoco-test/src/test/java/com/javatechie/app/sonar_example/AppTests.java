package com.javatechie.app.sonar_example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





class AppTests {

	
	@Test
	void testGetMessage() {
		String message = "Hello";
		Assertions.assertNotNull(message);
	}
}
