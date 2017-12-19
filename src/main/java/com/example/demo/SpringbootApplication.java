package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackages = "com.controller")
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication  	app = new SpringApplication(SpringbootApplication.class);
		app.run(args);
	}
}
