package com.ithlf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.ithlf.config.DBConfig1;
import com.ithlf.config.DBConfig2;

@ComponentScan(basePackages = { "com.ithlf.controller", "com.ithlf.datasource", "com.ithlf.test01",
		"com.ithlf.test02","com.ithlf.config" })
@EnableAutoConfiguration
@EnableConfigurationProperties(value={DBConfig1.class,DBConfig2.class})//读取数据源配置文件
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}	
}
