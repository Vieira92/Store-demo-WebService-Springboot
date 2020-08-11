package com.demostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostore.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
