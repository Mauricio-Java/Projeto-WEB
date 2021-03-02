package com.example.Prep_for_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prep_for_test.entities.Account;
import com.example.Prep_for_test.repositories.AccountRepository;


@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	
public List<Account> findALL() {
		return repository.findAll();
	}
	

public Account findById(Long Id) {
	Optional<Account> obj = repository.findById(Id);
	return obj.get();
}

public Account insert(Account obj) {
return repository.save(obj);
}

public void delete(Long id) {
		repository.deleteById(id);
	}

/*public Account update(Long id, Account obj) {
	
		Account entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	
	}	

private void updateData(Account entity, Account obj) {
	entity.setName(obj.getNumber());
	entity.setEmail(obj.getholder());
	entity.setPhone(obj.getbalance());
}*/
}

