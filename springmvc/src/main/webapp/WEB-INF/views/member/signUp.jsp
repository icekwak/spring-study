<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign Up</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/signUp.css"/>
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="/resources/js/checkId.js"></script>
	<script type="text/javascript" src="/resources/js/checkPw.js"></script>
</head>
<body>
	<form id="signUp" method="post" action="/member/signUp">
		<div>
			<div>
				<label for="user_id">아이디</label><input type="text" id="user_id" name="user_id">
				<span id="IDchk_0">사용 가능한 아이디</span>
				<span id="IDchk_1">사용중인 아이디</span>
			</div>
			<div><label for="user_pw1">비밀번호</label><input type="password"  class="user_pw" id="user_pw1" name="user_pw1"></div>
			<div>
				<label for="user_pw2">비밀번호 확인</label><input type="password" class="user_pw" id="user_pw2" name="user_pw2">
				<span id="eqPw_0">비밀번호 일치</span>
				<span id="eqPw_1">비밀번호 불일치</span>
			</div>
			<p id="PWchk">숫자/영문(대소문자)/특수문자(@,!,%,*,#,?,$)만 사용가능,6~18자</p>
		</div>
		<div>
			<input type="submit" value="회원가입">
		</div>
	</form>
</body>
</html>