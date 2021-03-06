package com.acme.sales.order;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findByCustomerIdNot(int customerId);
	
														
}																


//findByCustomerIdNot is the method name. List is a concrete interable/ collection class.
//<Order> is the type of data the list is pulling from. Iterable is similar to 
																
//interface in C#
																
//A method like this will be in your CAPSTONE! REMEMBER AND STUDY!