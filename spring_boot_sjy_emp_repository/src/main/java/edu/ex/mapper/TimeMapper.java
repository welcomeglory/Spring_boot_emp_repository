package edu.ex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.ex.vo.DeptVO;

@Mapper
public interface TimeMapper {
	
	@Select("select sysdate from dual")
	public String getTime();	
	
	@Select("select 1+1 from dual")
	public String getOnePlusOne();	
	
	@Select("select * from dept")
	public DeptVO getdept();	
	
}
