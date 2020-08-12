package com.demostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostore.entity.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
