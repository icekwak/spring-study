package com.study.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.BoardDAO;
import com.study.spring.entity.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getList() {
		
		List<BoardVO> list = boardDAO.getList();
		
		return list;
	}

	@Override
	public BoardVO detail(int id) {
		
		BoardVO boardVO = boardDAO.detail(id);
		
		return boardVO;
	}

	@Override
	public void insert(BoardVO boardVO) {
		
		boardDAO.insert(boardVO);
	}

	@Override
	public void update(BoardVO boardVO) {
		
		boardDAO.update(boardVO);
	}

}
