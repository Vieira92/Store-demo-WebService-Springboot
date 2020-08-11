package com.demostore.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demostore.entity.Order;
import com.demostore.entity.User;
import com.demostore.repository.OrderRepository;
import com.demostore.repository.UserRepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "916230547", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "913025478", "123456");
		
		Order o1 = new Order(null, Instant.parse("2020-07-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2020-08-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2020-08-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
