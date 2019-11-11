package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.Users;

public class UserDao {
	private Connection conn;
	
	private void openConnection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	}
	private void closeConnection(){
		try{
			conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public List<Users> readAllUsers(){
		List<Users> users = null;
		try{
			openConnection();
			String query = "Select * From RESULT";
			Statement stmt = conn.createStatement();
			ResultSet result1 = stmt.executeQuery(query);
			users = new ArrayList<Users >();
			while(result1.next()){
				String rollno = result1.getString("rollno");
				String fname = result1.getString("fname");
				String lname = result1.getString("lname");
				String course = result1.getString("course");
				String result = result1.getString("result");
				Users user = new Users(rollno, fname, lname,course, result);
				users.add(user);
			}
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return users;
	}
	
	public int deleteUser(String rollno){
		int result1 = 0;
		try{
			openConnection();
			String query = "Delete From RESULT Where rollno= ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, rollno);
			result1 = pstmt.executeUpdate();
		}
		catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			closeConnection();
		}
		return result1;
	}
	public int createUser(Users user){
		int result1 = 0;
		try {
			openConnection();
			String query = "Insert Into Result(rollno, fname, lname, course,result) Values (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getRollno());
			pstmt.setString(2, user.getFname());
			pstmt.setString(3, user.getLname());
			pstmt.setString(4, user.getCourse());
			pstmt.setString(5, user.getResult());
			
			result1 = pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return result1;
	}
	
}


	
	
	
	
	
	
	


