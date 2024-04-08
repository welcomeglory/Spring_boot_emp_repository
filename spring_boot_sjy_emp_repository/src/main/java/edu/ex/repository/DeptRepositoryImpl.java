package edu.ex.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.ex.vo.DeptVO;

// 스프링 컨테이너안에서 객체 생성.
@Repository //@component +의미(DAO)
public class DeptRepositoryImpl implements DeptRepository{
	
	@Override
	public List<DeptVO> selectList(){
		return null;
	}
	
}
