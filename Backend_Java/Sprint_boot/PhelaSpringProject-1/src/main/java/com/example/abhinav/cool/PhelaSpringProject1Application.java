package com.example.abhinav.cool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PhelaSpringProject1Application {

	public static void main(String[] args) {
		//return application instance
		ConfigurableApplicationContext context = SpringApplication.run(PhelaSpringProject1Application.class, args);
		
		Car car1 = context.getBean(Car.class);
		System.out.println(car1.getName());
		System.out.println(car1.getColour());
		System.out.println(car1.getEngine().getName());

		
	}

}
