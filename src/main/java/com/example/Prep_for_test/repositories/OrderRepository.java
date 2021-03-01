package com.example.Prep_for_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Prep_for_test.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
