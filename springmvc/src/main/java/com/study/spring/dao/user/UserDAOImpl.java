package com.study.spring.dao.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.study.spring.mapper.userMapper";

	@Override
	public int nameCheck(String name) {
		
		int n = sqlSession.selectOne(namespace + ".nameCheck", name);
		
		return n;
	}

	@Override
	public int emailCheck(String email) {
		
		int n = sqlSession.selectOne(namespace + ".emailCheck", email);
		
		return n;
	}

}
