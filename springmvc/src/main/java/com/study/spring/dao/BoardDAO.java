package com.study.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.study.spring.entity.BoardVO;
import com.study.spring.service.BoardService;

@Service
public class BoardDAO implements BoardService {
	
	@Autowired
	private DataSource dataSource;

	@Override
	public List<BoardVO> getList() {
		
		String sql = "SELECT * FROM board";
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		List<BoardVO> list = template.query(sql, new BeanPropertyRowMapper(BoardVO.class));
		
		return list;
	}

	@Override
	public BoardVO detail(int id) {
		
		String sql = "SELECT * FROM board WHERE board_id = ?";
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		BoardVO data = (BoardVO) template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper(BoardVO.class));
		
		return data;
	}
	
}
