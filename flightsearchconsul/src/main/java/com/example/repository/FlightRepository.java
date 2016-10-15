package com.example.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import com.example.model.Flight;



public interface FlightRepository extends MongoRepository<Flight, Long> {
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin,String destination, String flightDate);

	Flight findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
} 