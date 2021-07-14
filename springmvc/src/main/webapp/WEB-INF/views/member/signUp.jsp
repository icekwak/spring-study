<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<form id="signUp" method="post" action="/member/signUp">
		<div>
			<label for="user_id">아이디</label><input type="text" id="user_id" name="user_id">
			<label for="user_pw1">비밀번호</label><input type="password" id="user_pw1" name="user_pw1">
			<label for="user_pw2">비밀번호 확인</label><input type="password" id="user_pw2" name="user_pw2">
		</div>
		<div>
			<input type="submit" value="회원가입">
		</div>
	</form>
</body>
</html>