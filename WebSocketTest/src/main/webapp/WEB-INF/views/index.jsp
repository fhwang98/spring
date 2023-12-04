<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<style>
	
</style>
</head>
<body>
	
	<!-- index.jsp -->
	<h1>WebSocket <small>chat</small></h1>
	
	<div>
		<div class="group">
			<label>대화명</label>
			<input type="text" name="name" id="name" class="short">
		</div>
	</div>
	
	<div>
		<button type="buton" class="in">들어가기</button>
	</div>
		<hr>
	<div>
		<button type="buton" class="in" data-name="거북이">들어가기(거북이)</button>
		<button type="buton" class="in" data-name="호랑이">들어가기(호랑이)</button>
		<button type="buton" class="in" data-name="햄스터">들어가기(햄스터)</button>
		<button type="buton" class="in" data-name="카피바라">들어가기(카피바라)</button>
	</div>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
		$('.in').click(function() {
			let name = $('#name').val();
			if($(event.target).data('name') != null && $(event.target).data('name') != '') {
				name = $(event.target).data('name');
			}
			
			let child = window.open('/socket/chat.do', 'chat', 'width=330 height=420');
			
			//child.connect(name);
			
			child.addEventListener('load', function() {
				//자식창이 다 뜨고 나면 발생하는 이벤트
				child.connect(name);
			});
			
			$('.in').css('opacity', .5)
					.prop('disabled', true);
			$('#name').prop('readOnly', true);
			
		});
	</script>
</body>
</html>