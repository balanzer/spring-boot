package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleService {
	@RequestMapping("/greetings")
	public String greetings() {
		return "Hello World!!!";
	}
}
