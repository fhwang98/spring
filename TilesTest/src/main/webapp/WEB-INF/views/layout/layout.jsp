<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<tiles:insertAttribute name="asset"></tiles:insertAttribute>
<style>
	
</style>
</head>
<body>
	
	<!-- layout > member.jsp -->
	<tiles:insertAttribute name="main_menu"></tiles:insertAttribute>
	
	
	<tiles:insertAttribute name="sub_menu"></tiles:insertAttribute>
	
	<tiles:insertAttribute name="content"></tiles:insertAttribute>


	<script>
		
	</script>
</body>
</html>