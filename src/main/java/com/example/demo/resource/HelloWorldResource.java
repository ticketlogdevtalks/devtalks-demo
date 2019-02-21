package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldResource {
	
	@Autowired
	private Environment environment;
	
	@GetMapping
	public String helloWorld() {
		return "Hello World !!! " + " run in port: " + environment.getProperty("local.server.port");
	} 
	
}
