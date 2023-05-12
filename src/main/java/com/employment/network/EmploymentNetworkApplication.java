package com.employment.network;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmploymentNetworkApplication {

	private static final Logger LOGGER= LoggerFactory.getLogger(EmploymentNetworkApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EmploymentNetworkApplication.class, args);
	}
}
