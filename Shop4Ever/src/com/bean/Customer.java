package com.bean;


import java.util.ArrayList;

public class Customer {
	
	private int customerId;
	private String password;
	private String phoneNumber;
	 private String email;
	 private ArrayList<Integer> orderList=new ArrayList<Integer>();
		
		public ArrayList<Integer> getOrderList() {
			return orderList;
		}
		public void setOrderList(ArrayList<Integer> orderList) {
			this.orderList = orderList;
		}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}