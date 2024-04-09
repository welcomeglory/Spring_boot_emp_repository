package edu.ex.service;

import java.util.List;

import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;

public interface EmpService {
	List<EmpVO> getList();
	void register(EmpVO empVO);
	void remove(int empno);	
}
