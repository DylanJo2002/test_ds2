package com.test.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String doHelloWorld() {
		return "Hello world";
	}
	
	public int suma(int a, int b) {
		return a+b;
	}
}
