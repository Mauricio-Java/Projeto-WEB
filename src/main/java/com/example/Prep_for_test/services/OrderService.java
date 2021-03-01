package com.example.Prep_for_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prep_for_test.entities.Order;
import com.example.Prep_for_test.repositories.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
public List<Order> findALL() {
		return repository.findAll();
	}
	

public Order findById(Long Id) {
	Optional<Order> obj = repository.findById(Id);
	return obj.get();
}
}
