package com.example.Prep_for_test.resources;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Prep_for_test.entities.User;
import com.example.Prep_for_test.services.UserService;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findALL() {
		// Mudamos!!User u = new User(1L, "Maria", "maria@gmail.com", "9999999",
		// "1234567");
		List<User> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj){
		
		obj= service.insert(obj);
				//return ResponseEntity.ok().body(obj);   // esta certo mas vamos alterar para vir op codigo 201 ao inves de 200
				
				URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
						.buildAndExpand(obj.getId()).toUri();
				return ResponseEntity.created(uri).body(obj);
		
	}
}
