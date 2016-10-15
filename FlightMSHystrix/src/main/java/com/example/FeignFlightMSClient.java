package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Flight;
import com.example.service.FlightService;

@RestController
public class FeignFlightMSClient {
	
	@Autowired
	FlightService flightService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public Iterable<Flight> listOfFlights(){
		return flightService.listOfFlights();
	}
	
}
