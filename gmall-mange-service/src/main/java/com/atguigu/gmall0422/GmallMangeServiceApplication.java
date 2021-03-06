package com.atguigu.gmall0422;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall0422.mapper")
public class GmallMangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallMangeServiceApplication.class, args);
	}

}
