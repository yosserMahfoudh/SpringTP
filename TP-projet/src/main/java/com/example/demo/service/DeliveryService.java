package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Repository.DeliveryRepository;

import lombok.AllArgsConstructor;

@Service
public class DeliveryService {

	DeliveryRepository delirepo;
	
	
    public String RapidMan() {
        String rapidManname = delirepo.findRapidMan();
        return rapidManname;
    }
	

     public String LazyMan()
     {
    	 String LazyManname = delirepo.findLazyMan();
         return LazyManname;
     }



}
