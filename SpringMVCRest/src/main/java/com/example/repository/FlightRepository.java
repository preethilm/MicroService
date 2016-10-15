package com.example.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Flight;


@RepositoryRestResource(path="/datarest")
public interface FlightRepository extends MongoRepository<Flight, Integer>{

	//http://localhost:9090/datarest/search/findByDestinationName?name=Switzerland
	public List<Flight> findByDestinationName(@Param("name")String name) ;
	
}
