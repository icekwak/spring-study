<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign In</title>
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<form id="signIn" action="/member/signIn" method="post">
		<div>
			<label for="user_id">아이디</label><input type="text" id="user_id" name="user_id">
			<label for="user_pw">비밀번호</label><input type="password" id="user_pw" name="user_pw">
		</div>
		<div>
			<input type="submit" value="로그인">
			<input type="button" value="회원가입" onclick="location.href='/member/signUp';">
		</div>
	</form>
</body>
</html>