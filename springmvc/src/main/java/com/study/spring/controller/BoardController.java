package com.study.spring.controller;

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
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(Model model, int id) {
		
		BoardVO data = boardService.detail(id);
		model.addAttribute("data", data);
		
		return "board/detail";
	}
}
