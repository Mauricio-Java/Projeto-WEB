package com.example.Prep_for_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Prep_for_test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
