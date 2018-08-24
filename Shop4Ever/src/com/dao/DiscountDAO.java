package com.dao;

import java.util.Random;

import com.bean.Discount;
import com.helper.SessionHelper;


public class DiscountDAO {
	
	public void addDiscount(Discount discount)
	{
		Session session=SessionHelper.getHibernateSession();
		Transaction transaction=null;
		try{
			
			transaction=session.beginTransaction();
			session.save(discount);
			transaction.commit();
		}
		catch(HibernateException exception){
			if(transaction!=null)
				transaction.rollback();
			exception.printStackTrace();
		}
		finally{
			SessionHelper.closeHibernateSession(session);
		}
	}
	

	public  void approveDiscount(int discountId,int id) {
		
		Session session=SessionHelper.getHibernateSession();
		Transaction transaction=null;
		
		try{
			
			transaction=session.beginTransaction();
		String hql = "UPDATE Discount  set status =:status WHERE discountId =:discountId";
		Query query = session.createQuery(hql);
		
		query.setParameter("status", "APPROVED");
		query.setParameter("discountId",discountId );
		
	     int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
			
		System.out.println("successfully updated");
	
		transaction.commit();

		}
		catch(HibernateException exception){
			if(transaction!=null)
				transaction.rollback();
			exception.printStackTrace();
		}
		finally{
			SessionHelper.closeHibernateSession(session);
		}
		
	}
	
public  void rejectDiscount(int discountId) {
		
		Session session=SessionHelper.getHibernateSession();
		Transaction transaction=null;
		
		try{
			
			transaction=session.beginTransaction();
		String hql = "UPDATE Discount  set status =:status WHERE discountId =:discountId";
		Query query = session.createQuery(hql);
		query.setParameter("status", "REJECTED");
		query.setParameter("discountId",discountId );
		
	     int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
			
		System.out.println("successfully updated");
	
		transaction.commit();
        
		}
		catch(HibernateException exception){
			if(transaction!=null)
				transaction.rollback();
			exception.printStackTrace();
		}
		finally{
			SessionHelper.closeHibernateSession(session);
		}
		
	}

     public int generateRandomNumber()
    {

   // String name="DSC";
 
    Random random=new Random();
    int  num=random.nextInt(1000);

    //String pwd=Integer.toString(num);
    //String concat=name.concat(pwd);
   return num;
    }

}
