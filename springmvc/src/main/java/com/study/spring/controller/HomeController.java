package com.study.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.entity.BoardVO;
import com.study.spring.entity.paging.Criteria;
import com.study.spring.entity.paging.PageMaker;
import com.study.spring.service.board.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, @ModelAttribute Criteria cri) { 
									// @RequestParam(value="page", defaultValue="1") int page, 
									// @RequestParam(value="perPageNum", defaultValue="5") int perPageNum) {
		
		//Criteria cri = new Criteria(page, perPageNum);	// default (현재 페이지 번호 = 1, 한 페이지에 보여줄 게시글 수 = 10)
		
		List<BoardVO> list = boardService.getList(cri);
		int totalCount = boardService.count();
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		
		model.addAttribute("list", list);
		model.addAttribute("pageMaker", pageMaker);
		
		return "index";
	}
	
}
