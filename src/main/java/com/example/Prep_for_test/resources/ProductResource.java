package com.example.Prep_for_test.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prep_for_test.entities.Product;
import com.example.Prep_for_test.services.ProductService;

@RestController
@RequestMapping(value = "/products")   
public class ProductResource {

	@Autowired
	private ProductService service;
	@GetMapping
	public ResponseEntity<List<Product>> findALL() {
	//                                                 Mudamos!!Product u = new Product(1L, "Maria", "maria@gmail.com", "9999999", "1234567");
		List<Product> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
				return ResponseEntity.ok().body(obj);
	}
}
