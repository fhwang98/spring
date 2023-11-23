package com.test.mybatis.persistence;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

//1. junit
//2. log4j

@Log4j
public class JDBCTest {
	
	@Test
	public void testConnection() {
		
		//JDBC 연결 확인
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "oracle");
			
			assertNotNull(conn);
			
			log.info(conn.isClosed());
			log.warn("경고 메시지");
			log.error("에러 메시지");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
