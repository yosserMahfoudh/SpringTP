package com.example.demo.Entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Data
public class OrderDetailEntity {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	@Column
	private int qty;
	
	
	@Column
	private  float tax;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Item_ID", nullable = false, //
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK"))
    private ItemEntity item;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID", nullable = false, //
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
	private OrderEntity orders;
		
	
	public double calculWeight()
	{  
		return item.getWeight()*qty;
		
	}
	
	public double calculTotale()
	{  
		return item.getPrice()*qty+tax;
		
	}


	
}
