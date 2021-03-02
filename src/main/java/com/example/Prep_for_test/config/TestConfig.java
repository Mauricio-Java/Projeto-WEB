package com.example.Prep_for_test.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.Prep_for_test.entities.Account;
import com.example.Prep_for_test.repositories.AccountRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private AccountRepository accountRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		Account acc1 = new Account(55443321,"Mauricio",10.000);
		Account acc2 = new Account(55333321,"Iza",12.000);
		Account acc3 = new Account(55443321,"Gabi",12.000);
		
		accountRepository.saveAll(Arrays.asList(acc1,acc2,acc3));
	
		
		
	}	
}

