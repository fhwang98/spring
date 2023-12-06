package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.domain.AuthDTO;
import com.test.domain.MemberDTO;
import com.test.mapper.MemberMapper;

@Controller
public class MemberController {
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private MemberMapper mapper;

	@GetMapping(value = "/auth/register.do")
	public String register(Model model) {
		
		
		return "auth/register";
	}
	
	@PostMapping(value = "/auth/registerok.do")
	public String registerok(Model model, MemberDTO dto, int auth) {
		
		//암호 인코딩
		dto.setUserpw(encoder.encode(dto.getUserpw()));
		
		//tblMeber 추가
		
		int result = mapper.add(dto);
		if (auth >= 1) {
			AuthDTO adto = new AuthDTO();
			adto.setUserid(dto.getUserid());
			adto.setAuth("ROLE_MEMBER");
			mapper.addAuth(adto);
		}
		if (auth >= 2) {
			AuthDTO adto = new AuthDTO();
			adto.setUserid(dto.getUserid());
			adto.setAuth("ROLE_ADMIN");
			mapper.addAuth(adto);
		}
		
		return "redirect:/index.do";
	}
	
}
