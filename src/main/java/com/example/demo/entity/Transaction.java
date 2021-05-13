package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transaction {
	@Id
	public int sender_acc_no;
	public int password;
	public int receiver_acc_no;
	public int amount;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int sender_acc_no, int password, int receiver_acc_no, int amount) {
		super();
		this.sender_acc_no = sender_acc_no;
		this.password = password;
		this.receiver_acc_no = receiver_acc_no;
		this.amount = amount;
	}
	public int getSender_acc_no() {
		return sender_acc_no;
	}
	public void setSender_acc_no(int sender_acc_no) {
		this.sender_acc_no = sender_acc_no;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getReceiver_acc_no() {
		return receiver_acc_no;
	}
	public void setReceiver_acc_no(int receiver_acc_no) {
		this.receiver_acc_no = receiver_acc_no;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return String.format("Transaction [sender_acc_no=%s, password=%s, receiver_acc_no=%s, amount=%s]",
				sender_acc_no, password, receiver_acc_no, amount);
	}
	
	

}
