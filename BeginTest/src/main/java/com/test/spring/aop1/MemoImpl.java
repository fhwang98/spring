package com.test.spring.aop1;

import java.util.Calendar;

public class MemoImpl implements Memo {

	@Override
	public void add(String memo) {
		System.out.println("메모 쓰기: " + memo);
		
		//로그 기록
		//모든 업무에 추가.. > 주업무와 구분/관리 어려움
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG][%tF %tT] 로그를 기록합니다.\n", now, now);
		
		//여전히 주업무와 보조 업무 간의 구분/관리 어려움
		//Logger logger = new Logger();
		//logger.log();
		
		
	}

	@Override
	public String read(int seq) throws Exception {
		
		if (seq < 10) {
			System.out.println("메모 읽기");
		} else {
			throw new Exception("존재하지 않는 메모");
		}
		
		return "메모입니다.";
		
	}

	@Override
	public boolean edit(int seq, String memo) {
		System.out.println("메모 수정: " + memo);
		return true;
	}

	@Override
	public boolean del(int seq) {
		System.out.println("메모 삭제: " + seq);
		return true;
	}

}
