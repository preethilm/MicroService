package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.example.repository")
@EnableSwagger2
public class SpringMvcRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestApplication.class, args);
	}
}
