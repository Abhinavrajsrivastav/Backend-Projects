package com.example.abhinav.cool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PhelaSpringProjectApplication {

	public static void main(String[] args) {
		//return application instance
		ConfigurableApplicationContext context = SpringApplication.run(PhelaSpringProjectApplication.class, args);
		
		Car car1 = context.getBean(Car.class);
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
	}

}
