<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
</head>
<body>
	<table>
		<tr>
			<td>번호</td>
			<td>게시판</td>
		</tr>
		<c:forEach var="boardLists" items="${boardLists}">
			<tr>
				<td>${boardLists.id}</td>
				<td>
					${boardLists.title}
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>