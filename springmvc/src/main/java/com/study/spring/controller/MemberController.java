package com.study.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.entity.MemberVO;
import com.study.spring.service.member.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "signIn", method = RequestMethod.GET)
	public String signIn() {
		
		return "/member/signIn";
	}
	
	@RequestMapping(value = "signIn", method = RequestMethod.POST)
	public String signIn(HttpServletRequest request, String user_id, String user_pw) {
		
		MemberVO memberVO = new MemberVO(user_id, user_pw);
		
		String userName = memberService.signIn(memberVO);
		
		if(!user_id.equals(userName)) {
			return "redirect:/member/signIn";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "signOut", method = RequestMethod.GET)
	public String signOut(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping(value="signUp", method = RequestMethod.GET)
	public String signUp() {
		
		return "/member/signUp";
	}
	
	@RequestMapping(value="signUp", method = RequestMethod.POST)
	public String signUp(String user_id, String user_pw1, String user_pw2) {
		
		return "redirect:/member/signIn";
	}

}
