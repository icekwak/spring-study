package com.study.spring.service.user;

public interface UserService {

	public int nameCheck(String name);
	
	public int emailCheck(String email);
	
	public int passwordCheck(String pwd, String pwd_chk);
	
}
