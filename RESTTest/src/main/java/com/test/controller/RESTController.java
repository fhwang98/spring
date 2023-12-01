package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public int add(@RequestBody AddressDTO dto) { // 인자가 JSON > @RequestBody
		
		return dao.add(dto);
	}
	
	//목록보기
	//1. http://localhost/rest/address
	//2. GET
	//3. return List<DTO>
	@GetMapping(value = "/address")
	public List<AddressDTO> list() {
		
		return dao.list();
	}
	
	//수정하기
	//1. http://localhost/rest/address/1
	//2. PUT or (PATCH 빈도 낮음)
	//3. return int
	//@RequestMapping(value = "/address/{seq}", method=RequestMethod.PUT) // 경로 변수 (PathVariable)
	@PutMapping(value = "/address/{seq}")
	public int edit(@RequestBody AddressDTO dto, @PathVariable("seq") String seq) {
		dto.setSeq(seq);
		return dao.edit(dto);
	}
	
	//삭제하기
	//1. http://localhost/rest/address/1
	//2. DELETE
	//3. return int
	@DeleteMapping(value = "/address/{seq}")
	public int del(@PathVariable("seq") String seq) {
		return dao.del(seq);
	}
	
	//검색하기
	//1. http://localhost/rest/address/1
	//2. GET
	//3. return DTO
	@GetMapping(value = "/address/{seq}")
	public AddressDTO get(@PathVariable("seq") String seq) {
		return dao.get(seq);
	}
	
}
