package com.helper;

public class SessionHelper {
	
	private static final SessionFactory sessionFactory;
	static{
		
		try{
			
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}catch (Throwable e) {
			System.err.println("Initial SessionFactory creation failed"+e);
			throw new ExceptionInInitializerError(e);
		}
		
	}
	
	public static Session getHibernateSession(){
		Session session = sessionFactory.openSession();
		System.out.println("The session object:: "+session);
		return session;
	}
	
	
	public static void closeHibernateSession(Session session){
		
		session.close();
		System.out.println("Session successfully closed");
	}
}
