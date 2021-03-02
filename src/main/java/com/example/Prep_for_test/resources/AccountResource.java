package com.example.Prep_for_test.resources;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Prep_for_test.entities.Account;
import com.example.Prep_for_test.services.AccountService;



@RestController
@RequestMapping(value = "/account")
public class AccountResource {

	@Autowired
	private AccountService service;

	@GetMapping
	public ResponseEntity<List<Account>> findALL() {
		// Mudamos!!Account u = new Account(1L, "Maria", "maria@gmail.com", "9999999",
		// "1234567");
		List<Account> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Account> findById(@PathVariable Long id) {
		Account obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Account> insert(@RequestBody Account obj){
		
		obj= service.insert(obj);
				return ResponseEntity.ok().body(obj);   // esta certo mas vamos alterar para vir op codigo 201 ao inves de 200
				
				/*URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
						.buildAndExpand(obj.getId()).toUri();
				return ResponseEntity.created(uri).body(obj);	
				*/		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
/*	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Account> update(@PathVariable Long id, @RequestBody Account obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}*/
}
