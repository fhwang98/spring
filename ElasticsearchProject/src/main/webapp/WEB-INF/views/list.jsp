<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<style>
	#list th:nth-child(1) { width: 100px; }	
	#list th:nth-child(2) { width: auto; }	
	#list th:nth-child(3) { width: 100px; }	
	#list th:nth-child(4) { width: 100px; }	
	#list th:nth-child(5) { width: 100px; }
	#list td { text-align: center; }
	
	#list td:nth-child(1) img { width: 90px; }	
	#list td:nth-child(2) { text-align: left; }	
	#list td:nth-child(3)::after { content: '원'; }	
</style>
</head>
<body>
	
	<!-- list.jsp -->
	<h1 class="main">Book Project <small>List</small></h1>
	
	<div>
		<button type="button" class="add"
			onclick="location.href='/project/add.do';">도서 추가하기</button>
	</div>
	
	<table id="list">
		<tr>
			<th>표지</th>
			<th>제목</th>
			<th>가격</th>
			<th>저자</th>
			<th>출판사</th>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td><img alt="" src="${dto.image }"></td>
			<td><a href="/project/view.do?seq=${dto.seq }">${dto.title }</</a></td>
			<td><fmt:formatNumber value="${dto.discount }" pattern="#,###" /></td>
			<td>${dto.author }</td>
			<td>${dto.publisher }</td>
		</tr>
		</c:forEach>
	</table>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
		
	</script>
</body>
</html>