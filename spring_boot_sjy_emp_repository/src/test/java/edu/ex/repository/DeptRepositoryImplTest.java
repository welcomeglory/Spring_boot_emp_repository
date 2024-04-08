package edu.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ex.vo.DeptVO;

@SpringBootTest
class DeptRepositoryImplTest {
	
	@Autowired
	private DeptRepository deptRepository;
	
	@Test
	void testDeptRepository() {
		assertNotNull(deptRepository);
	}
	
	@Test
	void testselectList() {
		
		for(DeptVO deptVO : deptRepository.selectList() ) {
			System.out.println("부서번호"+deptVO.getDeptno());

			System.out.println("부서이름"+deptVO.getDname());
			
			System.out.println("부서위치"+deptVO.getLoc());

		}
	}
	
	

}
