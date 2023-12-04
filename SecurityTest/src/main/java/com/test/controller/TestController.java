package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping(value = "/index.do")
	public String index(Model model) {
		//모든 사용자
		
		return "index";
	}
	
	@GetMapping(value = "/member/member.do")
	public String member(Model model) {
		//회원 전용 + 관리자 전용
		
		return "member/member";
	}

	@GetMapping(value = "/admin/admin.do")
	public String admin(Model model) {
		//관리자 전용
		
		return "admin/admin";
	}
	
}
