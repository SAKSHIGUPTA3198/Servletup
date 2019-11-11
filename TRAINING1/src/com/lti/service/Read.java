package com.lti.service;

import java.util.List;

import com.lti.model.training;
import com.lti.training.train;

public class Read {
	
train dao = null;

public Read() {
	dao = new train();
}
public List<training> readAllUsers(){
	
	return dao.readAllUsers();
	
}
public boolean removeUser(String trainingid){
	int result =dao.deleteUser(trainingid);
	if (result == 1)
		return true;
	else
		return false;
	
}


}
