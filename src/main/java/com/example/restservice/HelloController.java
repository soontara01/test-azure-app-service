package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/test")
	public String index() {
		System.out.println("sss");
		return "Greetings from Spring Boot!ddd";
	}

}
