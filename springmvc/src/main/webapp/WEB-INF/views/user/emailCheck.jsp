<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Email Check</title>
	<script type="text/javascript" src="/resources/js/emailCheck.js"></script>
</head>
<body>
	<form id="email-form" action="/user/emailCheck" method="post">
		<div>
			<label for="email">이메일</label>
			<input type="email" id="email" name="email">
			<input type="button" id="btn-mail" value="메일발송">
			<span id="email-text"></span>
		</div>
		<div>
			<label for="num">인증번호</label>
			<input type="text" id="num" name="num">
			<input type="button" id="btn-mail-check" value="인증확인">
			<span id="num-text"></span>
		</div>
		<div>
			<input type="button" id="btn-signUp" value="다음">
		</div>
	</form>
</body>
</html>