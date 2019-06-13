package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@Value("${service.greeting}")
    	private String message;
	
	@GetMapping("/greet")
	public String greetHello() {
		return message;
	}
}
