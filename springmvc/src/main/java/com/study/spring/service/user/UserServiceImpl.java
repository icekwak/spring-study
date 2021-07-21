package com.study.spring.service.user;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.study.spring.dao.user.UserDAO;
import com.study.spring.entity.AuthVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	@Autowired
	private JavaMailSender mailSender;
	
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
		
		String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
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

	@Override
	public void emailSend(String email) {
		
		Random rand = new Random();
		int num = rand.nextInt(900000) + 100000; // 100000 ~ 999999
		
		String setfrom = "sw20175105@g-mail.hallym.ac.kr";
		String tomail = email;
		String title = "회원가입 인증 이메일 입니다.";
		String content = 
				System.getProperty("line.separator") +
				"인증번호는 " + num + " 입니다." +
				System.getProperty("line.separator") +
				"인증번호를 홈페이지에 입력해주세요.";
		
		try {
			// 메일 발송
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom(setfrom);		// 보내는사람 생략하면 정상작동을 안함
            messageHelper.setTo(tomail);		// 받는사람 이메일
            messageHelper.setSubject(title);	// 메일제목은 생략이 가능하다
            messageHelper.setText(content);		// 메일 내용
            
            mailSender.send(message);
            
            // DB 저장
            AuthVO authVO = new AuthVO(email, num);
            int check = dao.checkAuth(authVO);
            
            if(check == 0)
            	dao.insertAuth(authVO);
            else
            	dao.updateAuth(authVO);
            
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		// DB에 인증번호 저장 구현
		
	}

	@Override
	public int numCheck(AuthVO authVO) {
		
		int c = dao.numCheck(authVO);
		
		return c;
	}

	@Override
	public void deleteAuth(AuthVO authVO) throws Exception {
		
		dao.deleteAuth(authVO);
		
	}

}
