package com.example.demo.Entity;

import java.util.List; 

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Customer{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerid;	
	
	@Column
	private String name;
	
	@Column
	private String deliveryAddress;
	
	@Column
	private String contact;
	
	@Column
	private boolean active;
	

   @OneToMany(targetEntity=OrderEntity.class, mappedBy="customer",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
   @JsonIgnore
   private List<OrderEntity> orders;
 
}
