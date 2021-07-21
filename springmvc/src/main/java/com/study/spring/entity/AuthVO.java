package com.study.spring.entity;

public class AuthVO {
	private String email;
	private int number;
	private String date;
	
	public AuthVO() {}
	
	public AuthVO(String email, int number) {
		this.email = email;
		this.number = number;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
}
