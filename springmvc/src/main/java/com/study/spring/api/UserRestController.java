package com.study.spring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.entity.AuthVO;
import com.study.spring.service.user.UserService;

@RestController
@RequestMapping("/user/api/")
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "nameCheck", method = RequestMethod.POST)
	public int nameCheck(@RequestBody String name) {
		
		int n = service.nameCheck(name);
		
		return n;
	}
	
	@RequestMapping(value = "emailCheck", method = RequestMethod.POST)
	public int emailCheck(@RequestBody String email) {
		
		int n = service.emailCheck(email);
		
		if(n == 0)
			service.emailSend(email); // 메일 발송
		
		return n;
	}
	
	@RequestMapping(value = "numCheck", method = RequestMethod.POST)
	public int numCheck(@RequestParam(value="email") String email, @RequestParam(value="num") int num) throws Exception {
		
		AuthVO authVO = new AuthVO(email, num);
		int n = service.numCheck(authVO);
		
		if(n == 1) {
			service.deleteAuth(authVO);
		}
		
		return n;
	}
	
	@RequestMapping(value = "passwordCheck", method = RequestMethod.POST)
	public int passwordCheck(@RequestParam(value="pwd") String pwd, @RequestParam(value="pwd_chk") String pwd_chk) {
		
		int chk = service.passwordCheck(pwd, pwd_chk);
		
		return chk;
	}
	
}
