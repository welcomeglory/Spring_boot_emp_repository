package edu.ex.repository;

import java.util.List;

import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;

public interface EmpRepository {
	List<EmpVO> selectList();
//	void insert(EmpVO empVO);
//	void delete(int deptno);
	
}
