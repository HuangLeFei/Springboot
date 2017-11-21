package com.ithlf.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching // ���������ע��
// @EnableScheduling//������ʱ�����ע��
@EnableAsync // �����첽��ע��
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ithlf.controller", "com.ithlf.service", "com.ithlf.app" })
@MapperScan(basePackages = "com.ithlf.mapper")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
