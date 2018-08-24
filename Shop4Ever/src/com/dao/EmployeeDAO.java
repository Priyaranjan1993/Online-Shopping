package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

	String role = null;
	
	public boolean check(String userid, String password) 
	{
		
		
		boolean status = false;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:orclilp","ja89p2","ja89p2");
			String query = "select * from P2E_EMPLOYEE where EMPLOYEEID = ? and PASSWORD = ? ";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, userid);
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			
			status = (rs.next());
				System.out.println(status);
				System.out.println(userid);
				System.out.println(password);
				ps.close();
			con.close();
			
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}

	public String getRole(int id) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:orclilp","ja89p2","ja89p2");
			String query = "select * from P2E_EMPLOYEE where EMPLOYEEID = ?";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			//status = (rs.next());
			while(rs.next())
			{
				role= rs.getString(4);
			}

			ps.close();
			con.close();
			
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return role;
	}

	public boolean check1(String userid, String password) {
		// TODO Auto-generated method stub

		
		boolean status = false;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:orclilp","ja89p2","ja89p2");
			String query = "select * from P2E_CUSTOMER where CUSTOMERID = ? and PASSWORD = ? ";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, userid);
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			
			status = (rs.next());
				System.out.println(status);
				System.out.println(userid);
				System.out.println(password);
				ps.close();
			con.close();
			
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
		
	}


}
