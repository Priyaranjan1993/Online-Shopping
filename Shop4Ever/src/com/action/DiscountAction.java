package com.action;





import java.util.ArrayList;


import com.util.DBUtil;
import com.dao.DiscountDAO;
import com.bean.Discount;
import com.helper.SessionHelper;



public class DiscountAction extends ActionSupport implements  ModelDriven<Discount> {
	


	private static final long serialVersionUID = 1L;
	
	String status=null;
	
	Discount discount=new Discount();
	
	ArrayList<Discount> discountList = new ArrayList<Discount>();
	
	
          DiscountDAO dao=new DiscountDAO();	
          
          
      	public Discount getModel() {
    		// TODO Auto-generated method stub
    		return discount;
    	}
    	@Override
    	public String execute()
    	{
    		return "success";
    	}
    	
	
	public ArrayList<Discount> getDiscountList() {
		return discountList;
	}

	public void setDiscountList(ArrayList<Discount> discountList) {
		this.discountList = discountList;
	}

	public Discount getDiscount() {
		return discount;
	}

    public void setDiscount(Discount discount) {
		this.discount = discount;
	}



    public String addDiscount(){

       dao.addDiscount(discount);
		return "success";
	}
    
    
    @SuppressWarnings("unchecked")
	public String viewDiscounts()
	{
    	/*System.out.println("before session inside view un approved ");
		Session session = SessionHelper.getHibernateSession();
		
		@SuppressWarnings("unused")
		Transaction transaction = session.beginTransaction();*/
		
		
		
		
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println("after session inside view un approved ");
		Query query = session.createQuery("from Discount d where d.status='PENDING'");
		discountList = (ArrayList<Discount>) query.list();
	
		  tx.commit();
			DBUtil.closeHibernatesession(session);
		//SessionHelper.closeHibernateSession(session);
		return "success";
	}

	@SuppressWarnings("unchecked")
	public String viewAllDiscounts()
	{
		/*System.out.println("inside view all ");
		Session session = SessionHelper.getHibernateSession();
		
		@SuppressWarnings("unused")
		Transaction transaction = session.beginTransaction();*/
		
		Session session=DBUtil.getHibernateSession();
		Transaction tx=session.beginTransaction();
		
		Query query = session.createQuery("from Discount d");
		discountList = (ArrayList<Discount>) query.list();
		
		
		  tx.commit();
			DBUtil.closeHibernatesession(session);
		//SessionHelper.closeHibernateSession(session);
		return "success";
	}

	
	
	public String approveDiscount( )
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	     
		dao.approveDiscount(Integer.parseInt(request.getParameter("discountId")),dao.generateRandomNumber());
		
		
		System.out.println("The random no. is"+dao.generateRandomNumber());
		return "success";
	}
	
	public String rejectDiscount( )
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	
		dao.rejectDiscount(Integer.parseInt(request.getParameter("discountId")));
		
		return "success";
	}
	
	
	
}
