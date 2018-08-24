package com.service;

import java.util.ArrayList;

import com.dao.CustomerDAO;


public class CustomerService {

	
	public ArrayList<Integer> getOrderIds(int id){
		ArrayList<Integer> orderIds=new ArrayList<Integer>();
		System.out.println("Inside order service");
		CustomerDAO customerDAO=new CustomerDAO();
		 orderIds=customerDAO.getOrderIds(id);
		return orderIds;
	}
}
