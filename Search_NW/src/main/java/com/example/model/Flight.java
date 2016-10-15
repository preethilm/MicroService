package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Document
public class Flight {

    @Id
  
	long id;
	
	String flightNumber;
	String origin;
	String destination;
	String flightDate;
	
	@JsonManagedReference
	Fares fares;

	@JsonManagedReference
	Inventory inventory;
	
	
	

	public Flight() {
		super();
	}
	
	
 


	public Flight(long id, String flightNumber, String origin, String destination, String flightDate, Fares fares,
			Inventory inventory) {
		this.id = id;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
		this.fares = fares;
		this.inventory = inventory;
	}





	public Flight(String flightNumber, String origin, String destination, String flightDate, Fares fares,
			Inventory inventory) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
		this.fares = fares;
		this.inventory = inventory;
	}





	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public Fares getFares() {
		return fares;
	}

	public void setFares(Fares fares) {
		this.fares = fares;
	}
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNUmber=" + flightNumber + ", origin=" + origin + ", destination="
				+ destination + ", flightDate=" + flightDate + ", fares=" + fares + ", inventory=" + inventory + "]";
	}

 
	
	
}
