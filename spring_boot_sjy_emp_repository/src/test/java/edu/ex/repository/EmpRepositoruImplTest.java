package edu.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ex.service.EmpService;
import edu.ex.vo.EmpVO;

@SpringBootTest//톰캣생성해라!!!
class EmpRepositoruImplTest {
	
	@Autowired
	private EmpRepository empRepository;

	@Test
	void testEmpRepository() {
		assertNotNull(empRepository);
	}
	@Test
	void testgetList() {
		for(EmpVO empVO : empRepository.selectList() ) {
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
//	@Disabled
//	@Test
//	void testInsert() {
//		empRepository.insert(new EmpVO(8000,"GRACE","PROGRAMER",7839,null,4000,1000,30));
//		for(EmpVO empVO : empRepository.selectList() ) {
//			System.out.println("직원번호"+empVO.getEmpno());
//			System.out.println("직원이름"+empVO.getEname());			
//			System.out.println("직무"+empVO.getJob());
//			System.out.println("부서"+empVO.getMgr());
//			System.out.println("입사일"+empVO.getHiredate());
//			System.out.println("월급"+empVO.getSal());
//			System.out.println("보너스"+empVO.getComm());
//			System.out.println("부서번호"+empVO.getDeptno());		
//		}		
//	}
	@Disabled
	@Test
	void testDelete() {
		empRepository.delete(8000);

		for(EmpVO empVO : empRepository.selectList() ) {
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
