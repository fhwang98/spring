package com.test.java.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class HikariCPTest {

	@Autowired
	private HikariDataSource dataSource;
	
	@Test
	public void testConnectionPool() {
		
		// 우리가 직접 Connection을 생성하지 않고
		// Connection Pool을 통해 Connection이 잘 생성되는지 테스트
		// root-context.xml 설정을 읽어서 잘 되는지 확인
		// 스프링에서 직접적으로 root-context.xml을 읽지 않아도 실행이 됐던 이유 > web.xml
		// web.xml > 서버가 실행될 때 자동으로 읽음 > contextConfigLocation > root-context.xml, servlet-context.xml 인식
		// test > spring 아님 > 자동으로 설정 읽지 x
		// 직접 설정을 불러서 인식
		
		assertNotNull(dataSource);
		
		try {
			
			//Connection conn = dataSource.getConnection();
			//assertEquals(false, conn.isClosed());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
