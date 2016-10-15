package com.example;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
public class MyResource {

	@RequestMapping("/")
	public Order getOrder(){
		return new Order("Order1");
	}
	
	@RequestMapping("/findByName")
	public HttpEntity<Order> getOrderByName(@RequestParam(value="name",required=false,defaultValue="Order1") String name){
		
		Order order1 = new Order("Order "+name);
		
		order1.add(linkTo(methodOn(MyResource.class).getOrderByName(name)).withSelfRel());		
		
		return new ResponseEntity<Order>(order1,HttpStatus.OK);
	}
}
