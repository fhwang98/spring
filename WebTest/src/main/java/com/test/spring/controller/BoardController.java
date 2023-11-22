package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board") // 중첩되는 중간 경로 따로 뺄 수 있음
public class BoardController {
	
	//- "/spring/board/list.do"
	//- "/spring/board/add.do"
	//- "/spring/board/addok.do"
	//- "/spring/board/view.do"
	
	
	//- doGet() 역할
	@RequestMapping(value = "/list.do", method = {RequestMethod.GET, RequestMethod.POST}) // 둘 다도 가능
	public String list() {
		return "board/list";
	}
	
	//- doGet() 역할
	@RequestMapping(value = "/add.do", method = RequestMethod.GET)
	public String add() {
		return "board/add";
	}
	
	//- doPost() 역할
	@RequestMapping(value = "/addok.do", method = RequestMethod.POST) // 다르면 405 에러
	public String addok() {
		return "board/addok";
	}
	
	//- doGet() 역할
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String view() {
		return "board/view";
	}
	
}
