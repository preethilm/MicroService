package com.example.controller;
 

public class SearchRabbitMQ {
	String flightNumber;
	String flightDate;
	Integer newInventory;
	
	
	public SearchRabbitMQ() {
		super();
	}
	
	
	public SearchRabbitMQ(String flightNumber, String flightDate, Integer newInventory) {
		super();
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.newInventory = newInventory;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getFlightDate() {
		return flightDate;
	}


	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}


	public Integer getNewInventory() {
		return newInventory;
	}


	public void setNewInventory(Integer newInventory) {
		this.newInventory = newInventory;
	}


	
	@Override
	public String toString() {
		return "SearchRabbitMQ [flightNumber=" + flightNumber + ", flightDate=" + flightDate + ", newInventory="
				+ newInventory + "]";
	}


	
}