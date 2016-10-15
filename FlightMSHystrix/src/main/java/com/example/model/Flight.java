package com.example.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Flight {

	private Integer id;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="hh:MM:ss")
	private Date startTime;	

	private String destinationName;
	
	public Flight() {
	}
	
	public Flight(Integer id, Date startTime, String destinationName) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.destinationName = destinationName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
	
}
