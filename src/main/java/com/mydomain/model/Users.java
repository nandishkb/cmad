package com.mydomain.model;

import java.util.Date;

public class Users {
	
	public Users() {
		
	}

	public Users(String name, String emailId, String password, Date joinDate, Integer age, String state) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.joinDate = joinDate;
		this.age = age;
		this.state = state;
	}

	private Integer id;
	private String name="";
	private String emailId="";
	private String password="";
	private Date joinDate=new Date();
	private Integer age;
	private String state="";

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password + ", joinDate="
				+ joinDate + ", age=" + age + ", state=" + state + "]";
	}
	
	

}