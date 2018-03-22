package com.SpringBoot.Example.SpringBootProject.Entity;

public class UserEntity {
	
	private int id;
	private String Email;
	private int mobileNumber;
	
	
	public UserEntity() {}
	
	public UserEntity(int id, String email, int mobileNumber) {
		super();
		this.id = id;
		Email = email;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
