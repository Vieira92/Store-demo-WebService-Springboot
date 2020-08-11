package com.demostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostore.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
