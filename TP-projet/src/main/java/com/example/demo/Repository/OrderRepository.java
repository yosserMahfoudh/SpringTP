package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.OrderEntity;
import com.example.demo.dao.CustomerDTO;
import com.example.demo.dao.OrderDao;


@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{
	
	@Query(value="select c.* from order_entity o, Customer c"
			+ " where c.customerid = o.customerid "
			+ "group by o.customerid "
			+ "order by count(o.customerid) "
			+ "DESC limit 5",nativeQuery = true)
	public List<Customer> topclient();
	
	
	@Query(value="SELECT C.* FROM customer C INNER JOIN order_entity T ON C.customerid= T.customerid GROUP BY T.customerid ORDER BY count(*) desc LIMIT 5;",nativeQuery = true)
	public List<Customer> topmontantclient();

}
