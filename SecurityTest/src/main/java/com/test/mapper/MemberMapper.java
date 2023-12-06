package com.test.mapper;

import com.test.domain.AuthDTO;
import com.test.domain.MemberDTO;

public interface MemberMapper {

	int add(MemberDTO dto);

	void addAuth(AuthDTO adto);

	MemberDTO read(String username);

}
