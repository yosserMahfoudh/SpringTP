package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.OrderEntity;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.dao.CustomerDTO;
import com.example.demo.dao.OrderDao;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderrepo;


	private ModelMapper mapper;


	public List<CustomerDTO> topclientscommands()
	{    List<Customer> entity =  orderrepo.topclient();

		  List<CustomerDTO> DtoList = mapList(entity, CustomerDTO.class);
		  return DtoList;
	}

  
  List<CustomerDTO> mapList(List<Customer> source, Class<CustomerDTO> targetClass) {
	    return source
	      .stream()
	      .map(element -> mapper.map(element, targetClass))
	      .collect(Collectors.toList());
  }	
  
  public List<CustomerDTO> topclinetmontant()
  { 
  List<Customer> entities =  orderrepo.topmontantclient();
  List<CustomerDTO> customerDtoList = mapList(entities, CustomerDTO.class);
  return customerDtoList;
  }
  
}
