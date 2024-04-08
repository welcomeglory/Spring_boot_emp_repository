package edu.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DeptRepositoryImplTest {
	
	@Autowired
	private DeptRepository deptRepository;
	
	@Test
	void test() {
		assertNotNull(deptRepository);
	}

}
