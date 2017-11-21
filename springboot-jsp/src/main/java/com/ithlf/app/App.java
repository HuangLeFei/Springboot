package com.ithlf.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching // 开启缓存的注解
// @EnableScheduling//开启定时任务的注解
@EnableAsync // 开启异步的注解
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ithlf.controller", "com.ithlf.service", "com.ithlf.app" })
@MapperScan(basePackages = "com.ithlf.mapper")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
