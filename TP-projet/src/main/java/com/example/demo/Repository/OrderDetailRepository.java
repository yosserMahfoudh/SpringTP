package com.example.demo.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.OrderDetailEntity;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
	
	
	
}