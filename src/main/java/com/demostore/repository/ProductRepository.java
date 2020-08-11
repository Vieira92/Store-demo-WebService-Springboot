package com.demostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostore.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
