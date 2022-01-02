package com.example.demo.Repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryRepository {

	@Query(
			  value = "SELECT delivery_man from delivery D GROUP BY delivery_man ORDER BY avg(D.delivery_date-D.shopping_date) ASC LIMIT 1", 
			  nativeQuery = true)
			String findRapidMan();
	
	@Query(
			  value = "SELECT deliveryman,Max(DATEDIFF(delivery_date,shopping_date)) as duré FROM `delivery_entity`;", 
			  nativeQuery = true)
	String findLazyMan();
}
