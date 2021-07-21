<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Sign Up</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/signUp.css?ver=1.2"/>
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="/resources/js/signUp.js?ver=1.2"></script>
</head>
<body>
	<div id="wrap">
		<form id="sign-up-form" action="/member/signUp" method="post">
			<div id="name-form">
				<label for="name">닉네임</label>
				<input type="text" id="name" name="name">
				<p id="name-text">한글, 영어 대소문자, 숫자만 입력 가능합니다. (글자수 2-10)</p>
			</div>
			<hr>
			<div id="email-form">
				<div>
					<label for="email">이메일</label>
					<input type="email" id="email" name="email">
					<input type="button" id="btn-email-send" value="메일발송">
				</div>
				<div>
					<label for="email-chk">인증번호</label>
					<input type="text" id="email-chk" name="emailChk">
					<input type="button" id="btn-email-chk" value="인증확인">
				</div>
				<p id="email-chk-text"></p>
			</div>
			<hr>
			<div id="password-form">
				<div>
					<label for="password">비밀번호</label>
					<input type="password" class="password" id="password" name="password">
				</div>
				<div>
					<label for="password-chk">비밀번호 확인</label>
					<input type="password" class="password" id="password-chk" name="passwordChk">
				</div>
				<div><input type="checkbox" id="password-show">비밀번호 표시</div>
				<p id="password-chk-text">영어 대소문자, 숫자, 특수문자(@,$,!,%,*,#,?)를 포함하여 작성 (글자수 6-18)</p>
			</div>
			<hr>
			<div id="btn">
				<input type="button" value="가입하기">
				<input type="button" value="뒤로가기" onclick="location.href='/member/signIn';">
			</div>
		</form>
	</div>
</body>
</html>