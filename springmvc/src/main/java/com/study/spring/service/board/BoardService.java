package com.study.spring.service.board;

import java.util.List;

import com.study.spring.entity.BoardVO;
import com.study.spring.entity.paging.Criteria;

public interface BoardService {

	public List<BoardVO> getList(Criteria cri);
	
	public BoardVO detail(int id);

	public void insert(BoardVO boardVO);
	
	public void update(BoardVO boardVO);
	
	public int count();
}
