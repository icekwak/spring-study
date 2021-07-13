<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <c:set var="path" value="${pageContext.request.contextPath}"/> --%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/index.css"/>
</head>
<body>
	<form id="board" action="/board/insert" method="GET">
		<h3>게시판</h3>
		<table>
			<thead>
				<tr>
					<th>게시물번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="n" items="${list}">
					<tr>
						<td>${n.board_id}</td>
						<td><a href="/board/detail?id=${n.board_id}">${n.board_title}</a></td>
						<td>${n.board_writer}</td>
						<td>${n.board_date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<input type="submit" value="글쓰기"/>
		</div>
	</form>
</body>
</html>
