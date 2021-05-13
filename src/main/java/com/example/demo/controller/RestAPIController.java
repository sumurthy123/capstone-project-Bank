package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.transaction.TranService;

@RestController
public class RestAPIController {
	@Autowired
	public UserService userService;
	@Autowired 
	public TranService tService;
	
	@GetMapping("/user/{acc_no}")
    @CrossOrigin
	public int getUser(@PathVariable int acc_no)
	{
		return this.userService.getUser(acc_no);
		
		
		
		
	}
	@GetMapping("/user")
	@CrossOrigin
	public List<User> getall()
	{
		return this.userService.getallusers();
	}
	
	
	@PostMapping("/user")
	@Transactional
	@CrossOrigin
	public String adduser(@RequestBody User user)
	{
		this.userService.addanyuser(user);
		return "Hello "+user.getName()+" you have opened an account";
	}
	
	@PutMapping("/user")
	@CrossOrigin
	public String  changeuser(@RequestBody User user)
	{
		this.userService.updateuser(user);
		return "updated successfully";
	}
	
	
    
    @DeleteMapping("/user/{acc_no}")
    @Transactional
    @CrossOrigin
    public String delete(@PathVariable int acc_no)
    {
    	 return this.userService.deleteuser(acc_no);
    	  
    }
    
    @PostMapping("/transaction")
    @Transactional
    @CrossOrigin
    public String transact(@RequestBody Transaction transaction)
    {
    	this.tService.dotransaction(transaction);
    	return "added";
    }
    
    @GetMapping("/transaction")
    @Transactional
    @CrossOrigin
    public List<Transaction> getusers()
    {
    	return this.tService.dogetusers();
    }
    
    @PutMapping("/transaction")
    @Transactional
    @CrossOrigin
	public Transaction payment(@RequestBody Transaction transaction)
	{
    	return this.tService.dopayment(transaction);
    	//return "payment   done   successfully";
	}
    
    @GetMapping("/transaction/{sender_acc_no}")
    @Transactional
    @CrossOrigin
    public Optional<Transaction> getuser(@PathVariable int sender_acc_no)
    {
    	return this.tService.getoneuser(sender_acc_no);
    }

}
