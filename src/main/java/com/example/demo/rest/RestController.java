package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping
	public String msg() {
		return "hello raju docker example";
	}

}
