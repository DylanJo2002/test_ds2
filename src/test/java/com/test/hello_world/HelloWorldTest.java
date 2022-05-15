package com.test.hello_world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld helloWorld = new HelloWorld();
		
		assertEquals(3,helloWorld.suma(1,2));
	}

}
