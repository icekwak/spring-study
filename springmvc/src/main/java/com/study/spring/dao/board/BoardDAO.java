package com.study.spring.dao.board;

import java.util.List;

import com.study.spring.entity.BoardVO;
import com.study.spring.entity.paging.Criteria;

public interface BoardDAO {

	public List<BoardVO> getList(Criteria cri);

	public BoardVO detail(int id);

	public void insert(BoardVO baordVO);
	
	public void update(BoardVO baordVO);

	public int count();
}
