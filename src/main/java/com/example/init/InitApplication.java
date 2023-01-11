package com.example.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitApplication {

	public static void main(String[] args) {
		System.out.println("DBA 1"); 
		SpringApplication.run(InitApplication.class, args);
	}

}
