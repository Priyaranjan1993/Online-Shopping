package com.service;

import java.util.ArrayList;


import com.bean.Employee;
import com.bean.Order;
import com.dao.DeliveryDAO;

public class DeliveryService {
	DeliveryDAO deliveryDao=new DeliveryDAO();
	
				public ArrayList<Order> retrieveOrders(int deliveryExecutiveId){
					System.out.println("inside delivery service");
					System.out.println(deliveryExecutiveId);
			
				ArrayList<Order> arrlist=new ArrayList<Order>();
				System.out.println("inside delivery service2");
				
				arrlist= deliveryDao.retrieveOrders(deliveryExecutiveId);
				
				
				return arrlist;
				}
	
	
	public ArrayList<Order>  retrieveOrdersByOrderId(int orderId) throws Exception{
		DeliveryDAO deliveryDao=new DeliveryDAO();
		 return deliveryDao.retrieveOrdersByOrderId(orderId);
	}
	
	public int updateOrderstatus(String orderStatus,int orderId) throws Exception{
		DeliveryDAO deliveryDao=new DeliveryDAO();
		 int a=deliveryDao.updateOrderstatus(orderStatus, orderId);
		 return a;
		 }
	public ArrayList<Order> retrieveOrdersByMode(int salesExecutiveId) throws Exception{
		DeliveryDAO deliveryDao=new DeliveryDAO();
		 return deliveryDao.retrieveOrdersByMode(salesExecutiveId);
	}
	public ArrayList<Employee> retrieveDEByCity(String city) throws Exception{
		System.out.println("in service");
		DeliveryDAO deliveryDao=new DeliveryDAO();
		 return deliveryDao.retrieveDEByCity(city);
	}

	public int assignDE(int employeeId,int orderId) throws Exception{
		DeliveryDAO deliveryDao=new DeliveryDAO();
		 int a=deliveryDao.assignDE(employeeId, orderId);
		 return a;
		 }

}
