package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DeliveryService;

import lombok.AllArgsConstructor;

@RestController

public class DeliveryController {
	
	DeliveryService deservice;
	
	
	
	@GetMapping(value ="/get/rapidMan")
	public String getRapidMan()
	{
		return deservice.RapidMan();
	}
	@GetMapping(value ="/get/LazyMan")
	public String getLazyMan()
	{
		return deservice.LazyMan();
	}
	public DeliveryController(DeliveryService deservice) {
		this.deservice = deservice;
	}
}
