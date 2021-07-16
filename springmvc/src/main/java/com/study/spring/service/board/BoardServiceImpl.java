package com.study.spring.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.board.BoardDAO;
import com.study.spring.entity.BoardVO;
import com.study.spring.entity.paging.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		List<BoardVO> list = boardDAO.getList(cri);
		
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

	@Override
	public int count() {
		
		int totalCount = boardDAO.count();
		
		return totalCount;
	}

}
