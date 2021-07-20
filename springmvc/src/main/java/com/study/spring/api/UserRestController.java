package com.study.spring.api;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.service.user.UserService;

@RestController
@RequestMapping("/user/api")
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping(value = "nameCheck", method = RequestMethod.POST)
	public int nameCheck(@RequestBody String name) {
		
		int n = service.nameCheck(name);
		
		return n;
	}
	
	@RequestMapping(value = "emailCheck", method = RequestMethod.POST)
	public int emailCheck(@RequestBody String email) {
		
		int n = service.emailCheck(email);
		
		if(n == 0) {
			System.out.println("p");
			// 메일 발송 구현
			
			return n; // 0
		}
		
		return n; // 1
	}
	
	@RequestMapping(value = "passwordCheck", method = RequestMethod.POST)
	public int passwordCheck(@RequestParam(value="pwd") String pwd, @RequestParam(value="pwd_chk") String pwd_chk) {
		
		int chk = service.passwordCheck(pwd, pwd_chk);
		
		return chk;
	}
}
