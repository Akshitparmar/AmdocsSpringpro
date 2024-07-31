package com.example.demo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Demo6Application {
	@GetMapping("/msg")
	
	public String show() {
		return "Welcome to jenkins session akshit";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}

}