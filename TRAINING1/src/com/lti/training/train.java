package com.lti.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.training;

public class train  {
	private static final long serialVersionUID = 1L;

	//	public List<training> readAllUsers(){
	public List<training>  readAllUsers(){
	
			try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			String query="Select * from training";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			List<training> users = new ArrayList<training>();
			while(result.next()){
				
				String id = result.getString("trainingid");
				String name = result.getString("trainingname");
				String seats = result.getString("availableseats");
				
				training user = new training();
				user.setTrainingid(id);
				user.setTrainingname(name);
				user.setAvailableseats(seats);
				users.add(user);
				
			}
			return users;
		}
			catch(ClassNotFoundException| SQLException e){
				e.printStackTrace();
			}
			return null;
	}
			
			

public int deleteUser(String trainingid){
	int result = 0;
	try
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		String query ="Delete from training where trainingid= ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, trainingid);
		result = pstmt.executeUpdate();
		System.out.println(result);
		
	
	}catch(ClassNotFoundException| SQLException e){
		e.printStackTrace();
		
	}
	finally{
		
	}
	return result;
}
}


