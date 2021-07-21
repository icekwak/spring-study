package com.study.spring.dao.user;

import com.study.spring.entity.AuthVO;

public interface UserDAO {

	public int nameCheck(String name);
	
	public int emailCheck(String email);
	
	public void insertAuth(AuthVO authVO);
	
	public int checkAuth(AuthVO authVO);
	
	public void updateAuth(AuthVO authVO);
	
	public int numCheck(AuthVO authVO);
	
	public void deleteAuth(AuthVO authVO) throws Exception;
	
}
