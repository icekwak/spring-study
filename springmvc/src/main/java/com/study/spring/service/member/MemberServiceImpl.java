package com.study.spring.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.member.MemberDAO;
import com.study.spring.entity.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public String signIn(MemberVO memberVO) {
		
		String userName = memberDAO.signIn(memberVO);
		
		return userName;
	}

	@Override
	public int listId(String user_id) {
		
		int check_id = memberDAO.listId(user_id);
		
		return check_id;
	}
	
	
}
