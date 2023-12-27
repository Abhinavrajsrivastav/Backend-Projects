package com.example.abhinav.springCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.abhinav.springCrud.service.CrudServise;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.abhinav.springCrud.controller"})
public class MarvelHeroesSpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelHeroesSpringBootCrudApplication.class, args);
	}
	
	 @Bean
	    public CrudServise crudServise() {
	        return new CrudServise();
	    }
	

}
