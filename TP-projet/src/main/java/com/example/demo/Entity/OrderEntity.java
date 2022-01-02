package com.example.demo.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	@Column
	private LocalDate dateTime;

	
	
	@OneToMany(mappedBy="orders")
	@JsonManagedReference
	private List<OrderDetailEntity> orderDetails;
	
	
	@OneToMany(mappedBy = "order")
	@JsonManagedReference
	private List<DeliveryEntity> deliveries;
	

	
	
	@ManyToOne()
	@JoinColumn(name="Customerid", referencedColumnName = "Customerid", insertable = false, updatable = false)    
	private Customer customer;

}
