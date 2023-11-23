package com.test.persistence;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.domain.MyBatisDTO;

@Repository
public class MyBatisDAOImpl implements MyBatisDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public void test() {

		System.out.println(template == null);
		
	}

	@Override
	public int add(MyBatisDTO dto) {
		/*
			JDBC
			1. Connection 연결
			2. Statement 실행
			3. ResultSet 결과
			
			MyBatis
			1. SqlSessionTemplate > 혼자다함
				a. 반환값 x
					- stat.executeUpdate()
					
					- template.insert()
					- template.update()
					- template.delete()
					
				b. 반환값 o
					- stat.executeQuery()
					- template.selectOne() > 결과셋 레코드 1개
					- template.selectList() > 결과셋 레코드 n개
					
		*/
		
		//this.template.insert("mapper 네임스페이스.쿼리id", 인자값);
		return this.template.insert("mybatis.add", dto);
		
	}

}
