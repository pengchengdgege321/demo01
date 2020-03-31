package com.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.oracle.dao")
@SpringBootApplication
public class BootstrapVue7Application {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapVue7Application.class, args);
	}
}
