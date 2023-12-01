package com.test.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperTest {
	
	//@Autowired
	//private SqlSessionTemplate template;
	
	@Autowired
	private TestMapper mapper;
	//인터페이스만 만들면 구현체는 스프링이 알아서 만들어줌;;
	
	@Test
	public void testMapper() {
		
		assertNotNull(mapper);
		
		System.out.println(mapper.getTime());
		
		System.out.println(mapper.getTime2());
		
	}

}
