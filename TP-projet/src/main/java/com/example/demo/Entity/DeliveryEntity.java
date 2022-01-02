package com.example.demo.Entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Data
public class DeliveryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	@Column
	private String deliveryman;
	
	@Column
	private Date shoppingDate;
	
	@Column
	private LocalDate deliveryDate;
	
	
	@ManyToOne
	@JsonIgnore
	private OrderEntity order;
}
