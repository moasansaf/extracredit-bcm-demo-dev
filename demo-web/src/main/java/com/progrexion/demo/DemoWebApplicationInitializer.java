package com.progrexion.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.progrexion.demo")
public class DemoWebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplicationInitializer.class, args);
	}

}
