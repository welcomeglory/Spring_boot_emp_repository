package edu.ex.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.ex.vo.DeptVO;

@Repository
public class DeptRepositoryImpl implements DeptRepository{
	
	@Override
	public List<DeptVO> selectList(){
		return null;
	}
	
}
