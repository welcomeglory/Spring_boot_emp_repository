package edu.ex.database;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest//테스트를 위한 웹프로그래밍 환경 구축
class DataSourceTest {

	//커넥션 풀 객체
	@Autowired
	private DataSource dataSource; //커넥션풀
	

	@Test
	void testConnection() {
		

	}

}
