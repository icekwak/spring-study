package com.study.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.entity.BoardVO;
import com.study.spring.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		
		return "index";
	}
	
}
