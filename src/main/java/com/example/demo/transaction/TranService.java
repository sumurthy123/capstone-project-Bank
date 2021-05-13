package com.example.demo.transaction;

import java.util.List;
import java.util.Optional;

import com.example.demo.*;
import com.example.demo.entity.Transaction;
public interface TranService {

	public void dotransaction(Transaction t);
	 List<Transaction> dogetusers();
	 
	public Transaction dopayment(Transaction transaction);
	public Optional<Transaction> getoneuser(int sender_acc_no);
}
