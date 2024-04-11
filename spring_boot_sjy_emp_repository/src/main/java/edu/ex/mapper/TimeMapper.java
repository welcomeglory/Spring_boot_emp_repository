package edu.ex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//interface안의 함수는 자식에서 구현되어야 하는데
//마이바티스는 xml을 통해서 구현하도록 만들어짐.
@Mapper
public interface TimeMapper {
	
	@Select("select sysdate from dual")
	public String getTime();	
	
	@Select("select 1+1 from dual")
	public String getOnePlusOne();	
	
	public String getTime2();
}
