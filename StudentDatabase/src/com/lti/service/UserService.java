package com.lti.service;

import java.util.List;

import com.lti.dao.UserDao;
import com.lti.model.Users;

public class UserService {
	UserDao dao = null;
	public UserService(){
		dao = new UserDao();
	}

	public List<Users> findAllUsers(){
		return dao.readAllUsers();
	}
	public boolean removeUser(String rollno){
		int result1 = dao.deleteUser(rollno);
		if(result1 ==1)
			return true;
		else
			return false;
	}
	public boolean addUser(Users user){
		int result1 = dao.createUser(user);
		if(result1 ==1)
			return true;
		else
			return false;
	}

}
