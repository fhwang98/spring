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
	
	<!-- test.jsp -->
	<h1>WebSocket <small>연결 테스트</small></h1>
	
	<div>
		<button type="button" class="in" id="btnConnect">연결하기</button>
		<button type="button" class="out" id="btnDisconnect">종료하기</button>
	</div>
	
	<hr>
	
	<div>
		<input type="text" class="long" id="msg">
		<button type="button" id="btnMsg">보내기</button>
	</div>
	
	<hr>
	
	<div class="message full"></div>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
	
		//클라이언트 <-> 서버
		//ws : 웹소켓 프로토콜
		const url = "ws://localhost:8090/socket/testserver.do";
		
		//웹 소켓 참조 변수
		let ws;
		
		
		//1. 소켓 생성
		//2. 서버 접속(연결)
		//3. 통신
		//4. 서버 접속 해제(종료)
		
		$('#btnConnect').click(function() {
			
			//1. 소켓 생성
			//2. 서버 접속(연결)
			ws = new WebSocket(url);
			
			//소켓 이벤트 > 콜백형태
			ws.onopen = function(evt) {
				//서버 측에서 소켓 연결을 받아들이고 연결이 되는 순간 onopen 이벤트 발생!
				log('서버와 연결되었습니다.');
			};
			
			//실제로 연결이 끊기는 순간 이벤트 발생
			ws.onclose = function(evt) {
				log('서버와 연결이 종료되었습니다.');
			}
			
			//서버가 나에게 메시지를 보낼 때 발생하는 이벤트
			ws.onmessage = function(evt) {
					log(evt.data);
			}
			
			//에러 발생시 호출되는 이벤트
			ws.onerror = function(evt) {
				log('에러가 발생했습니다.' + evt);
			}
			
		});
		
		$('#btnDisconnect').click(function() {
			
			ws.close(); // 연결을 끊으려고 시도
			log('연결을 종료합니다.');
			
		});
		
		function log(msg) {
			$('.message').prepend(`
				<div>[\${new Date().toLocaleTimeString()}] \${msg}</div>		
			`);
		}
		
		$('#btnMsg').click(function() {
			
			//연결된 서버에게 메시지 전송하기
			//ws.send('전달할 메시지');
			ws.send($('#msg').val());
			log('메시지를 전송했습니다.');
			
			$('#msg').val('');
			
		});
	
	</script>
</body>
</html>