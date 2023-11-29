package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.AddressDTO;
import com.test.persistence.AddressDAO;

//REST 전용 컨트롤러
//요청 메소드의 반환값에 자동으로 @ResponseBody가 적용된다.
@RestController
public class RESTController {
	
	@Autowired
	private AddressDAO dao;

	//CRUD + REST
	
	//추가하기
	//1. http://localhost/rest/address
	//2. POST
	//3. return int
	
	//@RequestMapping(value ="/address", method = RequestMethod.POST)
	@PostMapping(value = "/address")
	public int add(@RequestBody AddressDTO dto) {
		
		return dao.add(dto);
	}
	
	
	
	
	
}
