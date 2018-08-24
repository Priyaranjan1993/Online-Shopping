package com.action;

import com.bean.Employee;
import com.bean.Order;
import com.service.DeliveryService;

public class SalesExecutiveAction implements ModelDriven<Employee>{
	private Employee employee=new Employee();
	DeliveryService deliveryService=new DeliveryService();
	Order order=new Order();
	private static int id2;
	
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	
	public static int getId2() {
		return id2;
	}

	public static void setId2(int id2) {
		SalesExecutiveAction.id2 = id2;
	}
	
	@SkipValidation
	public String selectcity() throws Exception
	{
		System.out.println(employee.getCity());
		id2=employee.getOrderIdSelected();
		System.out.println("sdgsg " +employee.getOrderIdSelected());
		employee.setEmployeeList(deliveryService.retrieveDEByCity(employee.getCity()));
		return "success";
	}

	

	
	
	

}
