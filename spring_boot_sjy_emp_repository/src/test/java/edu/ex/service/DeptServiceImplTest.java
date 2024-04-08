package edu.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ex.vo.DeptVO;

@SpringBootTest
class DeptServiceImplTest {
	
	@Autowired
	private DeptService deptService;

	@Test
	void testDeptService() {
		assertNotNull(deptService);
	}
	@Test
	void testgetList() {

		for(DeptVO deptVO : deptService.getList() ) {
			System.out.println("부서번호"+deptVO.getDeptno());
			System.out.println("부서이름"+deptVO.getDname());			
			System.out.println("부서위치"+deptVO.getLoc());
		}		
	}
}
