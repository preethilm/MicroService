package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//not working

@RestController
@CrossOrigin
public class PushMessageController {

	@Autowired
	private RabbitMessagingTemplate template;

	@Bean
	Queue queue() {
		return new Queue("inventoryQ", false);
	}
	
	
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public void send(@RequestBody SearchRabbitMQ payload){
		
		Map<String,Object> messageMap = new HashMap<>();
		messageMap.put("FLIGHT_NUMBER", payload.getFlightNumber());
		messageMap.put("FLIGHT_DATE", payload.getFlightDate());
		messageMap.put("NEW_INVENTORY", payload.getNewInventory());
		
		template.convertAndSend("inventoryQ",payload);
	}
}
