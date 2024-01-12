package com.jenspring.jenkin.api;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
		logger.info("Doneeeeee");
	}

	public static void main(String[] args) {
		logger.info("Application Executed");
		logger.info("changed");

		SpringApplication.run(SpringJenkinsApplication.class, args);

	}

}
