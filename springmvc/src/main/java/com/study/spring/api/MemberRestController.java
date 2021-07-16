package com.study.spring.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.service.member.MemberService;

@RestController
@RequestMapping("/member/api/")
public class MemberRestController {

	@Autowired
	private MemberService memberService;
	
	// 아이디 중복 확인
	@RequestMapping(value = "listId", method = RequestMethod.POST)
	public int listId(@RequestBody String user_id){
		
		int check_id = memberService.listId(user_id);
		
		return check_id;
	}
	
	// 비밀번호 확인
	@RequestMapping(value = "checkPw", method = RequestMethod.POST)
	public int checkPw(@RequestBody String user_pw){
	
		String check_pw = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?])[A-Za-z[0-9]$@$!%*#?]{6,18}$";
		Pattern pattern = Pattern.compile(check_pw);
		Matcher matcher = pattern.matcher(user_pw);
		int check = 1; // 유효성 검사 불통 = 1, 통과 = 0
		
		if(matcher.find())
			check = 0;
		
		return check;
	}
}
