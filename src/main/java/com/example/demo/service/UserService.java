package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.User;

public interface UserService {

	int getUser(int acc_no);

	List<User> getallusers();

	void addanyuser(User user);

	void updateuser(User user);

	

	String deleteuser(int acc_no);

	

}