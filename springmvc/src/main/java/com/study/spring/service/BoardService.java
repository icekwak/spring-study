package com.study.spring.service;

import java.util.List;

import com.study.spring.entity.BoardVO;

public interface BoardService {

	public List<BoardVO> getList();
	
	public BoardVO detail(int id);

	public void insert(BoardVO boardVO);
	
	public void update(BoardVO boardVO);
}
