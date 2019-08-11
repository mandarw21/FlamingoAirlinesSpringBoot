package com.flamingo.model;

public class User {
	private int userId;
	private String userName;
	private String emailId;
	private int age;
	private String gender;
	private long mobileNumber;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public User(int userId, String userName, String emailId, int age, String gender, long mobileNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

}
