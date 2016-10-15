package com.example.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Flight;


public interface FlightService {

	@RequestMapping(value="/flights",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Flight> listOfFlights();	
}
