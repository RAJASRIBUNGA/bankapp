package com.springboot.bankapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	private String name;
	@Column(length=512)
	private String address;
	
	private String city;
	
	private int panNumber;
	@OneToOne(cascade = CascadeType.ALL)
	private String account;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
