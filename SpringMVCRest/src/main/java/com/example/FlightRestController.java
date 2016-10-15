package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.FlightRepository;

@RestController
@RequestMapping("/flights")
public class FlightRestController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public Iterable<Flight> listOfFlights(){
		return flightRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Flight getFlight(@PathVariable("id") Integer id){
		return flightRepository.findOne(id);
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseStatus(code=org.springframework.http.HttpStatus.CREATED)
	public void createFlight(@RequestBody Flight  flight){
		 flightRepository.save(flight);
	}

	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseStatus(code=org.springframework.http.HttpStatus.NO_CONTENT)
	public void updateFlight(@PathVariable("id") Integer id,@RequestBody Flight  flight){
		 flightRepository.save(flight);
	}
}
