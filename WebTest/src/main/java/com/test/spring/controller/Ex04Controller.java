package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping(value = "/ex04.do")
// 가상 주소는 컨트롤러에 붙일 수도, 메소드에 붙일 수도 있음
// 컨트롤러 하나에 여러 주소 매핑 가능하다 
// value = 생략 가능
@Controller
public class Ex04Controller {
	
	@RequestMapping(value = "/ex04.do")
	public String ex04() {
		return "ex04";
	}
	
	@RequestMapping(value = "/ex04_1.do")
	public String ex04_1() {
		return "ex04_1";
	}

}
