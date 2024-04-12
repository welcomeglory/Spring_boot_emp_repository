package edu.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	List<EmpVO> selectList();
	void insert(EmpVO empVO);
	void delete(int empno);
	
}
