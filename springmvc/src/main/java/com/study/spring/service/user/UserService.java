package com.study.spring.service.user;

import com.study.spring.entity.AuthVO;

public interface UserService {

	public int nameCheck(String name);
	
	public int emailCheck(String email);
	
	public void emailSend(String email);
	
	public int passwordCheck(String pwd, String pwd_chk);
	
	public int numCheck(AuthVO authVO);
	
	public void deleteAuth(AuthVO authVO) throws Exception;
	
}
