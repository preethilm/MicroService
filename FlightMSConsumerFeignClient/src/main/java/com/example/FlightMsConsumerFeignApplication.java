package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;



@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RibbonClient(name="flight-microservice",configuration=LBConfiguration.class)
public class FlightMsConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightMsConsumerFeignApplication.class, args);
	}
}
