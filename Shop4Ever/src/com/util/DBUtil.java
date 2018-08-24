package com.util;

public class DBUtil {
	
	public static Session getHibernateSession()
	{
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		return session;
		
	}
	
	
	public static  void closeHibernatesession(Session session)
	{
		session.close();
	}

}
