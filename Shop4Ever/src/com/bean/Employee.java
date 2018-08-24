package com.bean;

import java.util.ArrayList;



public class Employee {
	
	private int employeeId;
	private String password;
	private String city;
	private String role;
	private int orderIdSelected;
	private ArrayList<Employee> employeeList= new ArrayList<Employee>();
	public int getOrderIdSelected() {
		return orderIdSelected;
	}
	public void setOrderIdSelected(int orderIdSelected) {
		this.orderIdSelected = orderIdSelected;
	}
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}