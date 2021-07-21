package com.study.spring.dao.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.spring.entity.AuthVO;

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

	@Override
	public void insertAuth(AuthVO authVO) {
		
		sqlSession.insert(namespace + ".insertAuth", authVO);
		
	}

	@Override
	public int checkAuth(AuthVO authVO) {
		
		int check = sqlSession.selectOne(namespace + ".checkAuth", authVO);
		
		return check;
	}

	@Override
	public void updateAuth(AuthVO authVO) {
		
		sqlSession.update(namespace + ".updateAuth", authVO);
		
	}

	@Override
	public void deleteAuth(AuthVO authVO) {
		
		sqlSession.delete(namespace + ".deleteAuth", authVO);
	}

	@Override
	public int numCheck(AuthVO authVO) {
		int check = sqlSession.selectOne(namespace + ".numCheck", authVO);
		
		return check;
	}

}
