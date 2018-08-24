package com.dao;

import java.util.ArrayList;


import java.util.Iterator;

import com.bean.Order;
import com.util.DBUtil;
import com.bean.Employee;

public class DeliveryDAO{
	
	@SuppressWarnings("unchecked")
	public ArrayList<Order> retrieveOrders(int deliveryExecutiveId){ 
		System.out.println("in dao"+deliveryExecutiveId);
		System.out.println("in dao"+deliveryExecutiveId);
		System.out.println("before THAT");
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println("AFTER THAT");
		
		ArrayList<Order> orderlist=new ArrayList<Order>();
		 System.out.println("in dao"+orderlist.size());
		 Query query = session.createQuery("FROM Order WHERE deliveryExecutiveId=:id ");
		
		 query.setParameter("id", deliveryExecutiveId);
		 
		 orderlist =(ArrayList<Order>) query.list();	
		 System.out.println("in dao"+orderlist.size());
		 
				Iterator<Order> r=orderlist.iterator();
					while(r.hasNext()){
						
						Order obj=r.next();
						
					System.out.println(obj.getOrderId());
					
					}
		  
		  
		 
	     tx.commit();
		DBUtil.closeHibernatesession(session);
		return orderlist;
		
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Order> retrieveOrdersByOrderId(int orderId){ 
		System.out.println("in dao"+orderId);
		System.out.println("in dao"+orderId);
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		ArrayList<Order> orderlistbyid=new ArrayList<Order>();
		Order or=new Order();
		
		 System.out.println("in dao"+orderlistbyid.size());
		Query query2 = session.createQuery("FROM Order WHERE orderId=:orderId ");
		
		query2.setParameter("orderId",orderId);
		 
		Iterator<Order> orderDetails=(Iterator<Order> )query2.list().iterator();

		  while(orderDetails.hasNext()){
			  
			  or=orderDetails.next();
			  System.out.println("fbe"+or.getOrderStatus());
			  orderlistbyid.add(or);
		  }
		  
		 
	     tx.commit();
		DBUtil.closeHibernatesession(session);
		return orderlistbyid;
		
	}

	public int updateOrderstatus(String orderStatus,int orderId){
		System.out.println("dao"+orderStatus);
		System.out.println("dao"+orderId);
		int numberOfRowsAffected=0;
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		 String hql ="update Order  set orderStatus=:orderStatus where orderId=:orderId";
	        Query query3 = session.createQuery(hql);
	        query3.setParameter("orderStatus",orderStatus);
	        query3.setParameter("orderId",orderId);
	         numberOfRowsAffected = query3.executeUpdate();
	        System.out.println("Rows affected:"+ numberOfRowsAffected);
		
		 tx.commit();
			DBUtil.closeHibernatesession(session);
			return numberOfRowsAffected ;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Order> retrieveOrdersByMode(int salesExecutiveId){ 
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		ArrayList<Order> orderlist=new ArrayList<Order>();
		 System.out.println("in dao"+orderlist.size());
		Query query4 = session.createQuery("FROM Order WHERE modeOfPayment='STORES' AND orderStatus='PAYMENT_DONE' AND salesExecutiveId=:salesExecutiveId ");
		query4.setParameter("salesExecutiveId",salesExecutiveId);
		 orderlist =(ArrayList<Order>) query4.list();	
		 System.out.println("in dao"+orderlist.size());
		 
				Iterator<Order> r=orderlist.iterator();
					while(r.hasNext()){
						
						Order obj=r.next();
						
					System.out.println(obj.getOrderId());
					}
		  
		  
		 
	     tx.commit();
		DBUtil.closeHibernatesession(session);
		return orderlist;
		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> retrieveDEByCity(String city){ 
		System.out.println("in dao"+city);
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		 System.out.println("in dao"+employeeList.size());
		 System.out.println("before");
		Query query5 = session.createQuery("FROM Employee WHERE city=:city AND role='DE' ");
		
		 query5.setParameter("city",city);
		 System.out.println("after");
		 employeeList =(ArrayList<Employee>)query5.list();	
		 Iterator<Employee> r=employeeList.iterator();
			while(r.hasNext()){
				
				Employee obj=r.next();
				
			System.out.println(obj.getEmployeeId());
			}

	     tx.commit();
		DBUtil.closeHibernatesession(session);
		return employeeList;
		
	}
	
	public int assignDE(int deliveryExecutiveId,int orderId){
		System.out.println("dao"+deliveryExecutiveId);
		System.out.println("dao"+orderId);
		int numberOfRowsAffected=0;
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		 String hql ="update Order set deliveryExecutiveId=:deliveryExecutiveId,orderStatus='SHIPPING_IN_PROGRESS' where orderId=:orderId";
	        Query query6 = session.createQuery(hql);
	        query6.setParameter("deliveryExecutiveId",deliveryExecutiveId);
	        query6.setParameter("orderId",orderId);
	         numberOfRowsAffected = query6.executeUpdate();
	        System.out.println("Rows affected:"+ numberOfRowsAffected);
		
		 tx.commit();
			DBUtil.closeHibernatesession(session);
			return numberOfRowsAffected ;
	}
	
	}

	
	




