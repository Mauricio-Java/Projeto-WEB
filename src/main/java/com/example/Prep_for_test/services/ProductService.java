package com.example.Prep_for_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prep_for_test.entities.Product;
import com.example.Prep_for_test.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
public List<Product> findALL() {
		return repository.findAll();
	}
	

public Product findById(Long Id) {
	Optional<Product> obj = repository.findById(Id);
	return obj.get();
}
}
