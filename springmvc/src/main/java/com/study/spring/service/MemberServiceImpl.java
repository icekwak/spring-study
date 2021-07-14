package com.study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.MemberDAO;
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
	
	
}
