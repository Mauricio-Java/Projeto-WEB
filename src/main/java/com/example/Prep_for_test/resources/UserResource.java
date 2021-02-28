package com.example.Prep_for_test.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prep_for_test.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findALL() {

		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "1234567");
		return ResponseEntity.ok().body(u);
	}
}
