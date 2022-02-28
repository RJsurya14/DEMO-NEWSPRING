package com.newspring.demonewspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.newspring.demonewspring"})
public class DemoNewspringApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(DemoNewspringApplication.class, args);
		System.out.println("Program is completed");  //print in the console after the program complier
	}

}