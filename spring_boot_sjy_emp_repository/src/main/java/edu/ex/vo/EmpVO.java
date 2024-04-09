package edu.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
}
