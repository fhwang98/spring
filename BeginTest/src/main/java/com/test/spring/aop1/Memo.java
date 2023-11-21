package com.test.spring.aop1;

public interface Memo {

	//메모 쓰기 > 언제 발생했는지 기록!! > Log
	void add(String memo);
	
	//메모 읽기 > 언제 발생했는지 기록!! > Log
	String read(int seq) throws Exception;
	
	//메모 수정 > 언제 발생했는지 기록!! > Log
	boolean edit(int seq, String memo);
	
	//메모 삭제 > 언제 발생했는지 기록!! > Log
	boolean del(int seq);
	
}
