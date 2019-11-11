package com.lti.dao;

import java.sql.Connection;
import java.io.IOException;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.lti.model.Users;

public class UserDao {
	private Connection conn;
	
	private void openConnection() throws SQLException, ClassNotFoundException{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
	}
	
	private void closeConnection(){
		try{
		conn.close();
		
		}catch( SQLException e){
			e.printStackTrace();
		}
		
	}
	public int readLogin(String username,String password){
		
		try {
			openConnection();
			String query ="Select * from Users where Username=? and Password=?";
			 PreparedStatement pstmt=conn.prepareStatement(query);
			 pstmt.setString(1, username);
			 pstmt.setString(2, password);
			ResultSet result = pstmt.executeQuery();
			if(result.next()){
				pstmt.close();
				
				return 1;
		} 
		}
		catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			
		
		}
		finally
		{
		closeConnection();
		}
		return 0;
		

}
	public List<Users> readAllUsers(){
		List<Users> users = null;
		try {
			openConnection();
			String query="Select * from Users";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			users = new ArrayList<>();
			while(result.next()){
			
				
				String uname = result.getString("Username");
				String fname = result.getString("Firstname");
				String lname = result.getString("Lastname");
				String mobile = result.getString("Mobilenumber");
				Users user = new Users(uname,null,fname,lname,mobile);
				users.add(user);
				 
			}
		
		}
		catch (SQLException |ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		finally
		{
		closeConnection();
		}
		return users;
		
		


	}
		/*List<Users> users = null;
		try{
		
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		 //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		String query="Select * from Users";
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(query);
		users = new ArrayList<>();
		while(result.next()){
		
			
			String uname = result.getString("Username");
			String fname = result.getString("Firstname");
			String lname = result.getString("Lastname");
			String mobile = result.getString("Mobilenumber");
			Users user = new Users(uname,null,fname,lname,mobile);
			users.add(user);
			 
		}
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
			
			finally{
				closeConnection();
			}
		return users;
	
	}*/
	public int deleteUser(String username){
		int result = 0;
		try
		{
			openConnection();
			String query ="Delete from Users where Username= ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			result = pstmt.executeUpdate();
			System.out.println(result);
			
		
		}catch(ClassNotFoundException| SQLException e){
			e.printStackTrace();
			
		}
		finally{
			closeConnection();
		}
		return result;
	}
}
