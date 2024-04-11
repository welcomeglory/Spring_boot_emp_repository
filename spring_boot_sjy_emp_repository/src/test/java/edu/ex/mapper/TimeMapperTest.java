package edu.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class TimeMapperTest {
	
	@Autowired
	private TimeMapper timeMapper;

	@Test
	void testTimeMapper() {
		assertNotNull(timeMapper);
	}
	@Disabled
	@Test
	void testGetTime() {
		log.info("시간이 나올까?=========="+timeMapper.getTime());
	}
	@Disabled
	@Test
	void testGetOnePlusOne() {
		log.info("1 + 1 = "+timeMapper.getOnePlusOne());
	}
	@Test
	void testGetTime2() {
		log.info("시간이 나올까2?=========="+timeMapper.getTime2());
	}	
}
