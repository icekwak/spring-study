package com.study.spring.dao.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.spring.entity.BoardVO;
import com.study.spring.entity.paging.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.study.spring.mapper.boardMapper";
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		List<BoardVO> list = sqlSession.selectList(namespace + ".getList", cri);
		
		return list;
	}

	@Override
	public BoardVO detail(int id) {
		
		BoardVO data = sqlSession.selectOne(namespace + ".detail", id);
		
		return data;
	}

	@Override
	public void insert(BoardVO boardVO) {
		
		sqlSession.insert(namespace + ".insert", boardVO);
	}

	@Override
	public void update(BoardVO baordVO) {
		
		sqlSession.update(namespace + ".update", baordVO);
	}

	@Override
	public int count() {
		
		int totalCount = sqlSession.selectOne(namespace + ".count");
		
		return totalCount;
	}

}
