package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1ConfigClient1Application {
	
	
	/*
	 * Http Url To Access Server Config Properties 
	 * 
	 * http://localhost:8088/msg						Method : GET
	 * To Get or Reflect Updated Config Server Message : http://localhost:8088/actuator/refresh  Method : POST
	 * 
	 */	

	public static void main(String[] args) {
		SpringApplication.run(Project1ConfigClient1Application.class, args);
	}
}
