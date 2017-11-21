package com.ithlf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.ithlf.controller")
@EnableJpaRepositories(basePackages = "com.ithlf.repository") // 扫描jpa中的dao层
@EntityScan(basePackages = "com.ithlf.entity") // 在jpa中扫描实体类
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
