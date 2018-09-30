package com.spring_Boot_test.spring.boot.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestAppApplication {

	public static void main(String[] args)
	{
		System.out.println("hello");
		SpringApplication.run(SpringBootTestAppApplication.class, args);
	}
}
