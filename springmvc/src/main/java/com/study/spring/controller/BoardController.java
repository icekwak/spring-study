package com.study.spring.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.entity.BoardVO;
import com.study.spring.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private ServletContext ctx;
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(Model model, int id) {
		
		BoardVO data = boardService.detail(id);
		model.addAttribute("data", data);
		
		return "board/detail";
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insert() {
		
		return "board/insert";
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(String title, String writer, String content) {
		
		BoardVO boardVO = new BoardVO(writer, title, content);
		
		boardService.insert(boardVO);
		
		return "redirect:/";
	}
}
