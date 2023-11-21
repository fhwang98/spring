package com.test.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.test.spring.persistence.SpringDAO;
import com.test.spring.persistence.SpringDAOImpl;

public class Ex02Controller implements Controller {

	//1.멤버변수로 선언
	private SpringDAO dao;
	
	//2. 의존주입도구 생성
	public Ex02Controller(SpringDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//Ex02Controller 객체 > 의존 > Spring 객체
		
		//업무 중 일부 > DB 작업 > DAO 위임

		//의존 객체
		//SpringDAO dao = new SpringDAOImpl();
		
		
		int count = dao.getCount();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("count", count);
		mv.setViewName("ex02");
		
		return mv;
	}

}
