package com.study.spring.dao;

import java.util.List;

import com.study.spring.entity.BoardVO;

public interface BoardDAO {

	List<BoardVO> getList();

	BoardVO detail(int id);

	void insert(BoardVO baordVO);

}
