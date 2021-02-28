package com.example.Prep_for_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prep_for_test.entities.User;
import com.example.Prep_for_test.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
public List<User> findALL() {
		return repository.findAll();
	}
	

public User findById(Long Id) {
	Optional<User> obj = repository.findById(Id);
	return obj.get();
}
}
