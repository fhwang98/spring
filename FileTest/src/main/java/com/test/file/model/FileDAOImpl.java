package com.test.file.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDAOImpl implements FileDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public int add(PlaceDTO dto) {
		
		//tblPlace 인서트 > tblPic 인서트
		
		//게시물 등록하기
		int result = template.insert("file.add", dto);
		
		//방금 등록한 게시물 번호등록하기
		int seq = template.selectOne("file.seq");
		
		for (PicDTO pdto : dto.getPicList()) {
			pdto.setPseq(seq + "");
			result += template.insert("file.picadd", pdto);
		}
		
		return result;
	}
	
	@Override
	public List<PlaceDTO> list() {
		return template.selectList("file.list");
	}
	
	@Override
	public PlaceDTO get(String seq) {
		
		PlaceDTO dto = template.selectOne("file.get", seq);
		
		List<PicDTO> plist = template.selectList("file.plist", seq);
		
		dto.setPicList(plist);
		
		return dto;
	}
	
	
	
	
	
	
	
	
	
	
}
