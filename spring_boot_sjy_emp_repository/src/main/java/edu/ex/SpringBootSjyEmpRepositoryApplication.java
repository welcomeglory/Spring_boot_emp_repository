package edu.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//마이바티스용 인터페이스를 통해 객체생성하기 위한
//인터페이스 위치를 알려줌.
@MapperScan(value = {"edu.ex.mapper"})
@SpringBootApplication
public class SpringBootSjyEmpRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSjyEmpRepositoryApplication.class, args);
	}

}
