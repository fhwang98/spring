package com.test.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//서블릿(X) > 서블릿같은 컨트롤러 역할(O) == <bean>으로 관리
public class Ex01Controller implements Controller {

	//http://localhost:8090/spring/WEB-INF/classes/com/test/spring/controller/Ex01Controller.java
	//http://localhost:8090/spring/ex01.do 직접 적어야함
	
	//doGet/doPost == handleRequest 비슷한 역할
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//업무 진행..
		
		//뷰 호출(JSP)
		//- RequestDispatcher > forward()
		
		//- ModelAndView 사용
		//	- Model > 데이터 전송
		//	- View > JSP
		
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("JSP 경로");
		//mv.setViewName("/WEB-INF/views/ex01.jsp");
		mv.setViewName("ex01");
		
		//잘 됨 but 비권장
		request.setAttribute("name", "홍길동");
		
		//권장
		mv.addObject("age", 20);
		
		return mv;
	}
	
}
