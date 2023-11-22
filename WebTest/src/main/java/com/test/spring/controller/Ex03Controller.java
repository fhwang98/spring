package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 컨트롤러 구현 방법
//1. Controller 인터페이스 구현
//2. @Controller 어노테이션 사용

//public class Ex03Controller implements Controller {
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}

@Controller
@RequestMapping(value = "/ex03.do") // 가상 주소 매핑
public class Ex03Controller {

	//요청 메소드(doGet/doPost/handleRequest) == 핸들러 > 맘대로~
	// 핸들러라는 표시 > 어노테이션
	@RequestMapping
	public String test() {
		
		//업무 코드
		
		//JSP 호출하기 > ModelAndView???
		
		//자동으로 
		// 1. ModelAndView 생성
		// 2. ViewResolver 동작
		// 3. JSP 호출
		return "ex03";
	}
	
	//Ambiguous mapping found. Cannot map 'ex03Controller' bean method 
	//@RequestMapping
	public int sum(int a, int b) {
		return a + b;
	}
	
}