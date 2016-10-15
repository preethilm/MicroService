package com.example.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.model.Flight;
import org.springframework.http.MediaType;

@FeignClient("flight-microservice")
public interface FlightMicroServiceDAO {
	
	@RequestMapping(value="/flights",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Flight> listOfFlights();	
	
	@RequestMapping(value="/flights/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Flight getFlight(@PathVariable("id")Integer id);
	
	@RequestMapping(value="/flights",method=RequestMethod.POST)
	@ResponseStatus(code=org.springframework.http.HttpStatus.CREATED)
	public void createFlight(@RequestBody Flight flight);

	@RequestMapping(value="/flights{id}",method=RequestMethod.PUT)
	@ResponseStatus(code=org.springframework.http.HttpStatus.NO_CONTENT)
	public void updateFlight(@PathVariable("id") Integer id,@RequestBody Flight  flight);
		 
}
