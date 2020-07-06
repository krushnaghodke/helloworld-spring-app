package com.example.demo.helloController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

	@PostMapping(value = "/api")
	public String helloSpring() {
		System.out.println("Hello Spring");
		return "Welcome in spring boot!";
	}
	
	@RequestMapping("/")  
	public String hello()   
	{  
		return "Hello javaTpoint"; 
	}  
	
}
