<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>제목</th>
				<td>${data.board_title}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${data.board_writer}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${data.board_date}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${data.board_content}</td>
			</tr>
		</tbody>
	</table>
	<div>
		<a href="/">목록</a>
		<c:if test="${userName eq data.board_writer}">
			<a href="/board/update?id=${data.board_id}">수정</a>
		</c:if>
	</div>
</body>
</html>