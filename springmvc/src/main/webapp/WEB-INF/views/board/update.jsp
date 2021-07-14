<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<form action="/board/update" method="POST">
		<input type="hidden" name="id" value="${Updata.board_id}"/>
		<table>
			<tbody>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" value="${Updata.board_title}"/></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer" value="${Updata.board_title}" readonly/></td>
				</tr>
				<!-- <tr>
					<th>첨부파일</th>
					<td><input type="file" name="file"/></td>
				</tr> -->
				<tr>
					<th>내용</th>
					<td><textarea name="content" rows="30" cols="50">${Updata.board_content}</textarea></td>
				</tr>
			</tbody>
		</table>
		<div>
			<input type="submit" value="등록"/>
			<a href="/board/detail?id=${Updata.board_id}">취소</a>
		</div>
	</form>
</body>
</html>