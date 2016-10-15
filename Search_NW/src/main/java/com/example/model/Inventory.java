package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {

    @Id
    
	long id;
    
    int count;
    
 
    public Inventory() {
		super();
	}

	public Inventory(int count) {
		super();
		this.count = count;
	}

 
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", count=" + count + "]";
	}
    
    
}
