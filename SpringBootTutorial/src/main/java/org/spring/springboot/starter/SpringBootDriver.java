package org.spring.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDriver {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDriver.class, args);
		System.out.println("My first bootstrap application");

	}

}
