package com.ithlf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 	* @describe��SpringBoot������ʽ2(ͨ��ɨ���ķ�ʽ����controller������� HelloController.java��HLFController.java)
 	* @author��HLF
 	* @createTime��2017����9:11:27
 	* @version��v1.0
	* @Accesspath��http://localhost:8080/hello2
	* Springboot���ʾ�̬ͼƬ·����http://localhost:8080/imgs/1.jpg  ����Ҫ��/static
 */
@ComponentScan(basePackages="com.ithlf.controller,com.ithlf.util")
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
