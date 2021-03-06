package com.jack.ssmh2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.jack.ssmh2.mapper")
@SpringBootApplication
public class SsmH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SsmH2Application.class, args);
	}
}
