package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.dao.CustomerDTO;
import com.example.demo.dao.OrderDao;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
    @Autowired
	OrderService orderservice;
    

	

	
}	

