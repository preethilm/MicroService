package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Flight;

@RestController
public class FeignFlightMSClient {
	
	@Autowired
	FlightMicroServiceConsumer discoveryClient;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public Iterable<Flight> listOfFlights(){
		return discoveryClient.listOfFlights();
	}
	
	@RequestMapping(value="/flights/{id}",method=RequestMethod.GET)
	public Flight getFlight(@PathVariable("id")Integer id){
		return discoveryClient.getFlight(id);		
	}
	
	@RequestMapping(value="/flights",method=RequestMethod.POST)
	@ResponseStatus(code=org.springframework.http.HttpStatus.CREATED)
	public void createFlight(@RequestBody Flight flight){
		discoveryClient.createFlight(flight);
	}
}
