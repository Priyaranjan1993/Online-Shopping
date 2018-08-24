package com.dao;

import java.util.ArrayList;

import com.bean.Order;
import com.util.DBUtil;

public class CustomerDAO {
	
public ArrayList<Integer> getOrderIds(int id){
		System.out.println(id);
		ArrayList<Integer> orderIds=new ArrayList<Integer>();
		Session session = DBUtil.getHibernateSession();
		Transaction tx = session.beginTransaction();
		 System.out.println("before");
		 Query qry=session.createQuery("SELECT o.orderId FROM Order o  where o.orderStatus=? and o.customerId=?");
		//Query qry=session.createSQLQuery("SELECT ORDERID FROM P2E_ORDER WHERE CUSTOMERID=?");
//		("SELECT o.orderId FROM Order o  where o.customerId=?");
		qry.setParameter(0,"PENDING");
		qry.setParameter(1,id);
		 System.out.println("after");
	
		orderIds= (ArrayList<Integer>)qry.list();
		System.out.println(orderIds.size());
		
		tx.commit();
		DBUtil.closeHibernatesession(session);
		
		
		return orderIds;
	}

}
