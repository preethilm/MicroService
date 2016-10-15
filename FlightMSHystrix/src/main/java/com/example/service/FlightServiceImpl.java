package com.example.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.FlightMicroServiceDAO;
import com.example.model.Flight;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightMicroServiceDAO flightMicroServiceDAO;

	@Override
	@HystrixCommand(fallbackMethod="listOfFlightsFallback")
	public Iterable<Flight> listOfFlights() {
		return flightMicroServiceDAO.listOfFlights();
	}
	
	public Iterable<Flight> listOfFlightsFallback() {
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight(11,new Date(),"Goa"));
		return flights;
	}
}
