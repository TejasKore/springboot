package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/sample")

public class SampleController {
	
	@GetMapping("/springboot")
	public String index() {
		return "This is sample Spring Boot!";
	}

}
