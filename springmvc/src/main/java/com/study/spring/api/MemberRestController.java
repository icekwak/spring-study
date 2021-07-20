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
	
	// 아이디 중복 확인 및 유효성 검사
	@RequestMapping(value = "listId", method = RequestMethod.POST)
	public int listId(@RequestBody String user_id){
		
		String str_chk_id = "^(?=.*[a-zA-Z])[a-zA-Z0-9]{6,12}$"; // 영문은 필수, 숫자는 허용
		Pattern pattern = Pattern.compile(str_chk_id);
		Matcher matcher = pattern.matcher(user_id);
		int check_id = -1; // 0 통과, 0이 아닌 값 불통
		
		// 유효성 검사 완료 후 중복 체크
		if(matcher.find()) {
			check_id = memberService.listId(user_id); // 0 = 중복X, 1 = 중복O
			
			return check_id;
		}
		
		return check_id;
	}
	
	// 비밀번호 확인
	@RequestMapping(value = "checkPw", method = RequestMethod.POST)
	public int checkPw(@RequestBody String user_pw){
	
		String check_pw = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?])[A-Za-z[0-9]$@$!%*#?]{6,18}$"; // 영문, 숫자, 특수문자 필수
		Pattern pattern = Pattern.compile(check_pw);
		Matcher matcher = pattern.matcher(user_pw);
		int check = 1; // 유효성 검사 불통 = 1, 통과 = 0
		
		if(matcher.find())
			check = 0;
		
		return check;
	}
}
