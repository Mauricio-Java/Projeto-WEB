package com.example.Prep_for_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Prep_for_test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
