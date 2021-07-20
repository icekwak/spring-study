<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <c:set var="path" value="${pageContext.request.contextPath}"/> --%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/index.css?ver=1.1"/>
</head>
<body>
	<div id="wrap">
		<!-- Header -->
		<div id="header">
			<div id="logo"><a href="/">Home</a></div>
			<div id="user-div">
				<c:if test="${userName == null}">
					<input type="button" id="sign-in" value="로그인" onclick="location.href='/member/signIn';">
					<input type="button" id="sign-up" value="회원가입" onclick="location.href='/member/signUp';">
				</c:if>
				<c:if test="${userName != null}">
					<span>${userName}님</span>
					<input type="button" id="sign-out" value="로그아웃" onclick="location.href='/member/signUp';">
				</c:if>
			</div>
		</div>
		<hr>
		<!-- board-form -->
		<form id="board-form" action="/board/insert" method="GET">
			<!-- content -->
			<div id="content">
				<div id="board-list">
					<table>
						<thead>
							<tr>
								<th>ID</th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성일</th>
								<th>댓글수</th>
								<th>조회수</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="d" items="${list}">
								<tr>
									<td>${d.board_id}</td>
									<td><a href="/board/detail?id=${d.board_id}">${d.board_title}</a></td>
									<td>${d.board_writer}</td>
									<td>${d.board_date}</td>
									<td></td>
									<td></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div id="paging">
					<ul>
						<c:if test="${pageMaker.prev}">
							<li><a href="/?page=${pageMaker.startPage - 1}&perPageNum=${pageMaker.cri.perPageNum}">&lt;</a></li>
						</c:if>
						<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
							<li><a href="/?page=${num}&perPageNum=${pageMaker.cri.perPageNum}">${num}</a></li>
						</c:forEach>
						<c:if test="${pageMaker.next}">
							<li><a href="/?page=${pageMaker.endPage + 1}&perPageNum=${pageMaker.cri.perPageNum}">&gt;</a></li>
						</c:if>
					</ul>
				</div>
			</div>
			<hr>
			<!-- content-footer -->
			<div id="content-footer">
				<c:if test="${userName != null}">
					<input type="submit" value="글쓰기"/>
				</c:if>
			</div>
		</form>
	</div>
</body>
</html>
