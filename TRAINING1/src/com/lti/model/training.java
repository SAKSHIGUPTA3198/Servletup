package com.lti.model;

public class training {
	
	private String trainingid;
	private String trainingname;
	private String availableseats;
	public String getTrainingid() {
		return trainingid;
	}
	public void setTrainingid(String trainingid) {
		this.trainingid = trainingid;
	}
	public String getTrainingname() {
		return trainingname;
	}
	public void setTrainingname(String trainingname) {
		this.trainingname = trainingname;
	}
	public String getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(String availableseats) {
		this.availableseats = availableseats;
	}
	public training(String trainingid, String trainingname, String availableseats) {
		super();
		this.trainingid = trainingid;
		this.trainingname = trainingname;
		this.availableseats = availableseats;
	}
	public training() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
