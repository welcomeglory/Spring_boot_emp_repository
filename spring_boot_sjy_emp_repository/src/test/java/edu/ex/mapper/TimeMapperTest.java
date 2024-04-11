package edu.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	
	@Test
	void testGetTime() {
		log.info("시간이 나올까?=========="+timeMapper.getTime());
	}
}
