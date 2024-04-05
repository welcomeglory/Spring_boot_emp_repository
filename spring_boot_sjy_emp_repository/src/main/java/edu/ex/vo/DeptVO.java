package edu.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeptVO {
	//연결할 오라클 파일과 이름 통일시킴
	private int deptno;
	private String dname;
	private String loc;
	
}
