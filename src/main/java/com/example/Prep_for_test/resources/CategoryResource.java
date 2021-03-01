package com.example.Prep_for_test.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prep_for_test.entities.Category;
import com.example.Prep_for_test.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	@GetMapping
	public ResponseEntity<List<Category>> findALL() {
	//                                                 Mudamos!!Category u = new Category(1L, "Maria", "maria@gmail.com", "9999999", "1234567");
		List<Category> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
				return ResponseEntity.ok().body(obj);
	}
}
