package com.java8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8DemoApplication {
	Java8DemoApplication() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		SpringApplication.run(Java8DemoApplication.class, args);
	}

}