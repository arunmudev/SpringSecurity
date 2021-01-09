package com.spring.boot.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Value("${server.port}")
	private int port;
	

	@GetMapping(value="/")
	public String home(){
		System.out.println(port);
		return "home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);				
	}

}
