package com.example.demo.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.DeliveryEntity;
import com.example.demo.Entity.OrderDetailEntity;
import com.example.demo.Entity.OrderStatuss;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDao {
	
private Integer id;	
private LocalDate dateTime;
//private OrderStatuss status;
private Customer customer;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public LocalDate getDateTime() {
	return dateTime;
}
public void setDateTime(LocalDate dateTime) {
	this.dateTime = dateTime;
}


public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
	 	

}
