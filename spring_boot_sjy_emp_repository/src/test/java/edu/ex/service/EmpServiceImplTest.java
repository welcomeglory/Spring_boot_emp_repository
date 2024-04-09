package edu.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;

@SpringBootTest
class EmpServiceImplTest {

	@Autowired
	private EmpService empService;
	
	@Test
	void testEmpService() {
		assertNotNull(empService);
	}
	@Test
	void testgetList() {
		for(EmpVO empVO : empService.getList() ) {
			System.out.println("직원번호"+empVO.getEmpno());
			System.out.println("직원이름"+empVO.getEname());			
			System.out.println("직무"+empVO.getJob());
			System.out.println("부서"+empVO.getMgr());
			System.out.println("입사일"+empVO.getHiredate());
			System.out.println("월급"+empVO.getSal());
			System.out.println("보너스"+empVO.getComm());
			System.out.println("부서번호"+empVO.getDeptno());		
		}		
	}
	
}
