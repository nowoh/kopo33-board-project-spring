<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>boardList</title>
<style>
html {
	background-color: #F0F0F0;
	font-family: 'Jua', 'Playfair Display', sans-serif, serif;
}

table, tr, td {
	border: 0px;
	border-collapse: collapse;
	border-bottom: 1px solid lightgrey;
	
}

td {
	padding: 4px;
}

tr#title {
	text-align: center;
	border-top: 2px solid black;
	border-bottom: 2px solid black;
}

.numbering {
	text-align: center;
}

span {
	position: absolute;
	top: 40%;
	left: 50%;
	transform: translate(-50%, -50%);
}

a:link {
	color: black;
	text-decoration: none;
}

a:hover {
	color: black;
	text-decoration: underline;
	cursor: pointer;
}

a:visited {
	color: black;
	text-decoration: none;
}

a.contents:visited {
	color: grey;
	text-decoration: none;
}
</style>
</head>
<body>
	<span>
		<table>
			<tr id="title">
				<td class="numbering" width=50>번호</td>
				<td width=400>게시판</td>
			</tr>
			<c:forEach var="boardLists" items="${boardLists}">
		   	<tr>
		   		<td class="numbering">${boardLists.id}</td>
		   		<td class="contents"><a href=/SpringBoard/boardItemList?board_id=${boardLists.id}>${boardLists.title}</a></td>
		   	</tr>
	  	</c:forEach>
		</table>
	</span>
</body>
</html>