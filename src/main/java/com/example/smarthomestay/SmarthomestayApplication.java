package com.example.smarthomestay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.smarthomestay.controllers","com.example.smarthomestay.impl","com.example.smarthomestay.service","com.example.smarthomestay.config"})
public class SmarthomestayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmarthomestayApplication.class, args);
	}

}
