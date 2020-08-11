package com.demostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostore.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
