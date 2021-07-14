package com.study.spring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.entity.BoardVO;
import com.study.spring.service.BoardService;

@RestController
public class BoardRestController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/test")
	public List<BoardVO> test() {
		
		List<BoardVO> list = boardService.getList();
		
		return list;
	}
}
