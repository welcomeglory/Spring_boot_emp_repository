package edu.ex.repository;

import java.util.List;

import edu.ex.vo.DeptVO;

public interface DeptRepository {
	List<DeptVO> selectList();
	void insert(DeptVO deptVO);
	
}
