package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.component.FlightRepository;
import com.example.model.Fares;
import com.example.model.Flight;
import com.example.model.Inventory;

@SpringBootApplication
@EnableDiscoveryClient
public class SearchMsApplication implements CommandLineRunner{
	
	@Autowired
	private FlightRepository flightRepository;

	public static void main(String[] args) {
		SpringApplication.run(SearchMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight("AI101","BLR","DL","23-OCT-2016",new Fares("5000","INR"),new Inventory(50)));
		flights.add(new Flight("AI102","CHN","KOL","24-OCT-2016",new Fares("3000","INR"),new Inventory(10)));
		flights.add(new Flight("AI103","MUM","HYD","25-OCT-2016",new Fares("4000","INR"),new Inventory(20)));
		flights.add(new Flight("AI104","BLR","HYD","26-OCT-2016",new Fares("1000","INR"),new Inventory(30)));
		
		flightRepository.save(flights);
	}
}
