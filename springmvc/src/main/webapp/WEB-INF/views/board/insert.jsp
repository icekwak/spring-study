<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
	<form action="/board/insert" method="POST">
		<table>
			<tbody>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"/></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer"/></td>
				</tr>
				<!-- <tr>
					<th>첨부파일</th>
					<td><input type="file" name="file"/></td>
				</tr> -->
				<tr>
					<th>내용</th>
					<td><textarea name="content" rows="30" cols="50"></textarea></td>
				</tr>
			</tbody>
		</table>
		<div>
			<input type="submit" value="등록"/>
			<input type="reset" value="새로쓰기"/>
			<a href="/">취소</a>
		</div>
	</form>
</body>
</html>