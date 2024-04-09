package edu.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeptVOTest {

	@Test
	void testDeptVO() {
		DeptVO dept = new DeptVO(1234, "영업팀", "서울");
		//주소 나오는거 확인
		System.out.println(dept);

		assertNotNull(dept);
		assertEquals(dept.getDname(), "영업팀");

	}

}
