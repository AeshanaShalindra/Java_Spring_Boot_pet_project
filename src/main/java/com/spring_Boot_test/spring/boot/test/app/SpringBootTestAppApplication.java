package com.spring_Boot_test.spring.boot.test.app;

import com.spring_Boot_test.spring.boot.test.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestAppApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args)
	{
		System.out.println("hello");
		SpringApplication.run(SpringBootTestAppApplication.class, args);
	}
}
