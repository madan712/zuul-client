package com.javaxp.zuulservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${spring.application.name}")
	private String instance;

	@Value("${server.port}")
	private String port;

	@GetMapping("/")
	public String message() {
		return "Hello Zuul from " + instance + ":" + port;
	}

}
