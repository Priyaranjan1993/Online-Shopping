package com.action;


import java.util.ArrayList;

import com.bean.Customer;
import com.bean.Order;
import com.service.OrderService;

public class OrderAction extends ActionSupport implements ModelDriven<Order>,ServletRequestAware{
	
	private static final long serialVersionUID = 1L;
	
	
	private HttpServletRequest request; 
	private HttpSession session;
	
	private int customerId;
	
	



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	private Order order=new Order();
	OrderService orderService=new OrderService();
	Customer customer=new Customer();
	
	
	
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public Order getModel() {
		// TODO Auto-generated method stub
		return order;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		
		this.setRequest(arg0);
	}
	
	public String execute()throws Exception{
		
		return "success";

	}
	
	
	

	

			
}



