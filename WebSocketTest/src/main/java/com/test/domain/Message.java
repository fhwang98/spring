package com.test.domain;

import lombok.Data;

@Data
public class Message {

	private String code;	//상태 코드
	private String sender;	//보내는 사람
	private String receiver;//받는 사람
	private String content;	//대화 내용
	private String regdate;	//날짜
	
}
