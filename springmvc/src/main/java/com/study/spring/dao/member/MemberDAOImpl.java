package com.study.spring.dao.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.spring.entity.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.study.spring.mapper.memberMapper";

	@Override
	public String signIn(MemberVO memberVO) {
		
		String userName = sqlSession.selectOne(namespace + ".signIn", memberVO);
		
		return userName;
	}

	@Override
	public int listId(String user_id) {
		
		int check_id = sqlSession.selectOne(namespace + ".listId", user_id);
		
		return check_id;
	}
	
	
}
