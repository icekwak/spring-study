package com.study.spring.dao.member;

import com.study.spring.entity.MemberVO;

public interface MemberDAO {
	
	public String signIn(MemberVO memberVO);
	
	public int listId(String user_id);
	
	//public void signUp(MemberVO memberVO);
}
