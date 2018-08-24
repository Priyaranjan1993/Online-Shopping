package com.action;



import java.util.Map;

import com.bean.Employee;
import com.dao.EmployeeDAO;

public class UserCheckAction extends ActionSupport 
implements ModelDriven<Employee>,ServletRequestAware,ServletResponseAware,SessionAware{


	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	HttpServletResponse response;
	private SessionMap<String,Object> sessionMap;
	
	int x = 0;
	int y = 0;
	String b = null;
	String type =null;
	int id = 0;
	String userid = null;
	String password = null;
	Employee employee  = new Employee();
	EmployeeDAO dao = new EmployeeDAO();

	@Override
	public Employee getModel() {
		return employee;
	}

	@SkipValidation
	public String check()
	{
		System.out.println("zz");
		// System.out.println(student.getFirstName());
		/*  x= Integer.parseInt(request.getParameter("amount"));
	  y = Integer.parseInt(request.getParameter("discount"));
	  System.out.println("value comes"+x);
	  System.out.println("value comes"+y);
	   dao.addTransaction(x,y);
		 */

		type = request.getParameter("UserType");
		userid= request.getParameter("employeeId");
		System.out.println(userid);
		password = request.getParameter("password");
		System.out.println(password);

		System.out.println(type);

		if(type.equals("employee"))
		{
			if( dao.check(userid,password))
			{
				id = Integer.parseInt(request.getParameter("employeeId"));
				System.out.println(type);
				sessionMap.put("userid",id);	
				
				b = dao.getRole(id);
				System.out.println(b);
				if(b.equalsIgnoreCase("se"))
				{
					return "se";
				}
				else if(b.equalsIgnoreCase("de"))
				{
					return "de";
				}
				else if(b.equalsIgnoreCase("smh"))
				{
					return "smh";
				}
				else if(b.equalsIgnoreCase("MD"))
				{
					return "MD";
				}
			}
		}
			else
			{id = Integer.parseInt(request.getParameter("employeeId"));
			System.out.println(type);
			sessionMap.put("userid",id);	
			

				if( dao.check1(userid,password))
				{
					return "cust";

				}
				return "error";

			}

		return "error";
		}
	
	



	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;

	}

	public HttpServletRequest getServletResponse() {
		return this.request;
	}


	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;

	}

	public HttpServletRequest getServletRequest() {
		return this.request;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		 sessionMap=(SessionMap)map; 
	}


	

}

