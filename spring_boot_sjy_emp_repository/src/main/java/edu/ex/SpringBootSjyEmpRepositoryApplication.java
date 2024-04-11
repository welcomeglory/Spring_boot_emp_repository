package edu.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"edu.ex.mapper"})
@SpringBootApplication
public class SpringBootSjyEmpRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSjyEmpRepositoryApplication.class, args);
	}

}
