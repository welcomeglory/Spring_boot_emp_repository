package edu.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.ex.vo.DeptVO;

@Mapper
public interface DeptMapper {
	List<DeptVO> selectList();

	void insert(DeptVO deptVO);

	void delete(int deptno);
	
}
