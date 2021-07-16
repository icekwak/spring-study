package com.study.spring.service.member;

import com.study.spring.entity.MemberVO;

public interface MemberService {

	public String signIn(MemberVO memberVO);
	
	public int listId(String user_id);
	
	//public void signUp(MemberVO memberVO);
}
