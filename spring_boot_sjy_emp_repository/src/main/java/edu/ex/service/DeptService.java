package edu.ex.service;

import java.util.List;

import edu.ex.vo.DeptVO;

public interface DeptService {
	List<DeptVO> getList();
	void register(DeptVO deptVO);	
	
}
