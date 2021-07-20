package com.study.spring.service.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.user.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	private Pattern pattern;
	
	@Override
	public int nameCheck(String name) {

		String regex = "^[가-힣a-zA-Z0-9]{2,10}$";
		pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		
		if(matcher.find()) {
			int n = dao.nameCheck(name);
			return n; // 0 = 사용 가능, 1 = 사용 불가능
		}
		
		return -1; // -1 = 정규실 불통
	}

	@Override
	public int emailCheck(String email) {
		
		String regex = "^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$";
		pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.find()) {
			int n = dao.emailCheck(email);
			
			return n; // 0 = 사용 가능, 1 = 사용 불가능
		}
		
		return -1;
	}

	@Override
	public int passwordCheck(String pwd, String pwd_chk) {
		
		String regex = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?])[A-Za-z[0-9]$@$!%*#?]{6,18}$";
		pattern = Pattern.compile(regex);
		Matcher matcher1 = pattern.matcher(pwd);
		Matcher matcher2 = pattern.matcher(pwd_chk);
		
		if(matcher1.find() && matcher2.find()) {
			
			if(pwd.equals(pwd_chk))
				return 0; // 일치 및 유효성 검사 통과
			
			return 1; // 불일치
		}
		
		return -1; // 유효성 검사 불통
	}

}
