package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.User;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.repository.UserRepository;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public TransactionRepository tRepository;

	@Override
	public int getUser(int acc_no) {
		
		User u= this.userRepository.getOne(acc_no);
		return u.getCash();
	}

	@Override
	public List<User> getallusers() {
		
		return this.userRepository.findAll();
	}

	@Override
	public void addanyuser(User user) {
		this.userRepository.save(user);
		
	}

	@Override
	public void updateuser(User user) {
		
		this.userRepository.save(user);
		
		
		
		
	}

	

	@Override
	public String deleteuser(int acc_no) {
		
	   List<User> list=this.userRepository.findAll();
	   for(User u:list)
	   {
		   if(u.getAcc_no()==acc_no)
		   {
			   this.userRepository.delete(u);
		   }
	   }
	   return "deleted";
	}

	
	
	

}
