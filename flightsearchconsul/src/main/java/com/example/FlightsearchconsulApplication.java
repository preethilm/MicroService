package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.model.Fares;
import com.example.model.Flight;
import com.example.model.Inventory;
import com.example.repository.FlightRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2 
@EnableRabbit
public class FlightsearchconsulApplication implements CommandLineRunner {
	
	@Autowired
	private FlightRepository flightRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlightsearchconsulApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight(1,"BF100", "SEA","SFO","22-JAN-16",new Fares("100", "USD"),new Inventory(100)));
		flights.add(new Flight(2,"BF101", "NYC","SFO","22-JAN-16",new Fares("101", "USD"),new Inventory(100)));
		flights.add(new Flight(3,"BF105", "NYC","SFO","22-JAN-16",new Fares("105", "USD"),new Inventory(100)));
		flights.add(new Flight(4,"BF106", "NYC","SFO","22-JAN-16",new Fares("106", "USD"),new Inventory(100)));
		flights.add(new Flight(5,"BF102", "CHI","SFO","22-JAN-16",new Fares("102", "USD"),new Inventory(100)));
		flights.add(new Flight(6,"BF103", "HOU","SFO","22-JAN-16",new Fares("103", "USD"),new Inventory(100)));
		flights.add(new Flight(7,"BF104", "LAX","SFO","22-JAN-16",new Fares("104", "USD"),new Inventory(100)));
	    
		flightRepository.save(flights);
		
		System.out.println("Looking to load flights...");
		/*for (Flight flight : flightRepository.findByOriginAndDestinationAndFlightDate("NYC", "SFO", "22-JAN-16")) {
	        System.out.println(flight.toString());
	    }*/
	}
}
