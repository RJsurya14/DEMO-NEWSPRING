package com.newspring.demonewspring.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newspring.demonewspring.dao.AccountRepo;
import com.newspring.demonewspring.model.Account_details;

@RestController
public class AccountController {
	@Autowired
	AccountRepo ar;
	
	@GetMapping("/accounts")
	public List<Account_details> getAccounts()
	{
		return (List<Account_details>)ar.findAll();
	}
	
	@GetMapping("/account/{accno}")
	public Account_details getAccount(@PathVariable int accno)
	{
		Account_details a = ar.findById(accno).orElse(new Account_details());
		return a;
	}
	
	@PostMapping("/addAccount")
	public Account_details addAccount( @RequestBody Account_details a)
	{
		
		ar.save(a);
		return a;
		
	}
	
	@PutMapping("/updateAccount/{accno}")
	public Account_details updateAccount(@PathVariable int accno,@RequestBody Account_details a)
	{
		Account_details acc = ar.findById(accno).orElse(a);
		acc.setAccname(a.getAccname());
		acc.setAccno(a.getAccno());
		acc.setBalance(a.getBalance());
		ar.save(acc);
		return acc;
	}
	
	@DeleteMapping("/deleteAccount/{accno}")
	public String deleteAccount(@PathVariable int accno){
		Account_details a = ar.findById(accno).orElse(new Account_details());
		ar.delete(a);
		return "Account deleted";
	}
}