package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;


@RestController
public class CustomerController {

	
    private CustomerService cser;

	CustomerController(CustomerService cse) {

        this.cser=cse;
    } 	

	@GetMapping("/api/get")
	public List<Customer> getAllEmp(){
		return cser.getAllCustomer();
	}

}
