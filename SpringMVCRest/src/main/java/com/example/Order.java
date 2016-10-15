package com.example;

import org.springframework.hateoas.ResourceSupport;

public class Order extends ResourceSupport{
	
	private String message;
	
	public Order(){
		
	}
	
    public Order(String message){
    	super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
