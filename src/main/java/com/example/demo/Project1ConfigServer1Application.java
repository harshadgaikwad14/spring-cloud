package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Project1ConfigServer1Application {

	/*
	 * Http Url To Access Server  Config Properties 
	 * 
	 * Development 	: http://localhost:8888/project1configserver1-client/development
	 * Production 	: http://localhost:8888/project1configserver1-client/production
	 * 
	 */		
		
	
	public static void main(String[] args) {
		SpringApplication.run(Project1ConfigServer1Application.class, args);
	}
}
