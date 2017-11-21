package com.ithlf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.ithlf.controller")
@EnableJpaRepositories(basePackages = "com.ithlf.repository") // ɨ��jpa�е�dao��
@EntityScan(basePackages = "com.ithlf.entity") // ��jpa��ɨ��ʵ����
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
