package edu.ex.database;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//데이터소스(커넥션풀 테스트)
@SpringBootTest//테스트를 위한 웹프로그래밍 환경 구축
class DataSourceTest {

	//커넥션 풀 객체
	@Autowired //주입
	private DataSource dataSource; //커넥션풀
	
	@Test
	void testConnection() {
		assertNotNull(dataSource);
		
		System.out.println("DS="+dataSource);
		
		//커넥션 객체 받아옴.
		try(Connection conn =  dataSource.getConnection()) {
			System.out.println(conn);
			assertThat(conn).isInstanceOf(Connection.class);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select 100 from dual");
			
			if(rs.next()) {
				System.out.println(rs.getLong(1));
				assertEquals(100,rs.getLong(1));
			}
			
		} catch (Exception e) {
		}
	}

}
