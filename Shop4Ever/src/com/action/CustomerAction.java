package com.action;

import java.util.ArrayList;
import java.util.Iterator;




import com.bean.Customer;
import com.bean.Order;
import com.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Customer customer=new Customer();
	
	 private CustomerService cusotmerService=new CustomerService();
	  static int i=0;

//	public Map getParamMap() {
//		return paramMap;
//	}

	

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	

//	public Map getM() {
//		return m;
//	}
//
//	public void setM(Map m) {
//		this.m = m;
//	}

	public String assign(){
		System.out.println("in assign");
		i=customer.getCustomerId();
		System.out.println("after");
		return "success";
	}
public String getOrderIds(){
		String flag="failure";
		System.out.println("Inside cust action:"+i);
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList=cusotmerService.getOrderIds(i);
		
		Iterator<Integer> itr=arrList.iterator();
		System.out.println("The list elements are:");
		while(itr.hasNext()){
			int x=itr.next();
			System.out.println(x);
		}
		
		customer.setOrderList(arrList) ;
			
		if(customer.getOrderList().size()>0)
			flag="success";
		
		return flag;
	}





}


