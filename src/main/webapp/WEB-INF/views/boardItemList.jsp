<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>BoardItem List</title>
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

#button {
	float: right;
	margin: 5px 5px;
	border: 1px solid black;
	font-size: medium;
	font-family: 'Jua', 'Playfair Display', sans-serif, serif;
}

#btt {
	margin: 5px 5px;
	font-size: medium;
}

.search {
	float: left;
	margin: 5px 5px;
	border: 1px solid black;
	font-size: medium;
	font-family: 'Jua', 'Playfair Display', sans-serif, serif;
	background-color: transparent;
}

#search {
	height: 25px;
}



button {
	background-color: transparent;
}

button:hover {
	cursor: pointer;
	background-color: #9cbed4;
}

#select {
	margin: 5px 0px;
	height: 25px;
	font-family: 'Jua', 'Playfair Display', sans-serif, serif;
}

#Pages {
	text-align: center;
}

#currentPage {
	font-size: 20px;
}
</style>
</head>
<body>
<form method="post" name="form">
	<span>
		<h1>
			SPRING 게시판 <i class="far fa-keyboard"></i>
		</h1>
		<table>
			<tr id="title">
				<td class="numbering" width=50>번호</td>
				<td width=400>제목</td>
				<td width=80>작성자</td>
				<td width=80>조회수</td>
				<td width=100>등록일</td>
			</tr>
			<c:forEach var="boardItemLists" items="${boardItemLists}">
				<tr>
					<td class='numbering'>${boardItemLists.id}</td>
					<td><a class='contents'>${boardItemLists.title}</a></td>
					<td class='numbering'>${boardItemLists.writer}</td>
					<td class='numbering'>${boardItemLists.viewcount}</td>
					<td class='numbering'>${boardItemLists.getBoardItemDate()}</td>
				</tr>
			</c:forEach>
		</table>
		<select name="select" id="select" class="search">
		<option value="제목내용" selected>제목+내용</option>
		<option value="제목">제목</option>
		<option value="내용">내용</option>
		<option value="작성자">작성자</option>
		</select> 
		<input type="text" name="search" id="search" class="search"	maxlength="50" value="" required>
		<button class="search" id="btt"	onclick="javascript: form.action='gongji_search.jsp';">검색 <i class="fas fa-search"></i></button>
		
		<button type=button id="button"	onclick="boardItem_insert">글쓰기 <i class="fas fa-pen"></i></button>
		<br><br>
	</span>
</form>
</body>
</html>