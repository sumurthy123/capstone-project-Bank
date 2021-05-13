package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	public int acc_no;
	public String name;
	public Integer password;
	public Integer cash;
	public Integer contact;
	public Integer getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public Integer getCash() {
		return cash;
	}
	public void setCash(Integer cash) {
		this.cash = cash;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	public User(int acc_no, String name, Integer password, Integer cash, Integer contact) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.password = password;
		this.cash = cash;
		this.contact = contact;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("User [acc_no=%s, name=%s, password=%s, cash=%s, contact=%s]", acc_no, name, password,
				cash, contact);
	}
	
	
}
