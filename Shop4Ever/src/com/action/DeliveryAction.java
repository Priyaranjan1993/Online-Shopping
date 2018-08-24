package com.action;


import java.util.ArrayList;
import java.util.Map;

import com.bean.Employee;
import com.bean.Order;
import com.service.DeliveryService;

public class DeliveryAction implements ModelDriven<Order>,SessionAware{

	private Order order=new Order();
	Employee employee=new Employee();
	DeliveryService deliveryService=new DeliveryService();
	private static int id1;
	
	private SessionMap<String,Object> sessionMap;
@Override
@VisitorFieldValidator(appendPrefix=false)
public Order getModel() {
	// TODO Auto-generated method stub
	return order;
}

@SkipValidation
public String getOrderIds() throws Exception
{
	System.out.println("inside delivery action");
	
	int id=(Integer)sessionMap.get("userid");
	
	System.out.println("yes...:"+id);
	
	ArrayList<Order> orderList=deliveryService.retrieveOrders(id);
	order.setOrderlist(orderList);
	
	System.out.println("action"+order.getOrderlist().size());
	return "success";
}



@SkipValidation
public String register() throws Exception
{
	System.out.println("action"+order.getOrderId());
	id1=order.getOrderId();
	order.setOrderlist(deliveryService.retrieveOrdersByOrderId(order.getOrderId()));
	System.out.println("action"+order.getOrderlist().size());
	return "success";
}

@SkipValidation
public String update() throws Exception{
		
		String flag="failure";
		System.out.println("actionnnn"+order.getOrderId());
		int Id=deliveryService.updateOrderstatus(order.getOrderStatus(),id1);
		if(Id>0)
		{
		flag="success";
		}
		
		return flag;
	}

@SkipValidation
public String seOrders() throws Exception
{
	int id=(Integer)sessionMap.get("userid");
	order.setOrderlist(deliveryService.retrieveOrdersByMode(id));
	
	System.out.println("action"+order.getOrderlist().size());
	return "success";
}

@SkipValidation
public String assignDE() throws Exception{
		
		String flag="failure";
		int Id=deliveryService.assignDE(order.getDeliveryExecutiveId(),SalesExecutiveAction.getId2());
		if(Id>0)
		{
		flag="success";
		}
		
		return flag;
	}









@Override
public void setSession(Map<String, Object> map) {
	// TODO Auto-generated method stub
	 sessionMap=(SessionMap)map;
}



}
