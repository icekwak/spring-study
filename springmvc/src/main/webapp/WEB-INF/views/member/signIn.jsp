<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
	<form id="signIn" action="/member/signIn" method="post">
		<div>
			<label for="user_id">아이디</label><input type="text" id="user_id" name="user_id">
			<label for="user_pw">비밀번호</label><input type="password" id="user_pw" name="user_pw">
		</div>
		<div>
			<input type="submit" value="로그인">
			<a href="/member/signUp">회원가입</a>
		</div>
	</form>
</body>
</html>