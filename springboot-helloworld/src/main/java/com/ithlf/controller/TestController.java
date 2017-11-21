package com.ithlf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @describe���ҵĵ�һ��Springboot��SpringBoot������ʽ1�� @author��HLF
 * @createTime��2017����9:31:47 @version��v1.0
 * @Accesspath��http://localhost:8080/hello
 */
// @RestController springboot �ṩ�� http refult���
// @RestController �൱�� Controllerÿ���������� @ResponseBody
// @ResponseBody ���� �������󷽷�����json��ʽ��
@RestController
// @EnableAutoConfiguration
public class TestController {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "success";
	}

	// ȫ�ֲ����쳣����(http://localhost:8080/QuanJuBuHuo)
	@RequestMapping("/QuanJuBuHuo")
	public String QuanJuBuHuo() {
		int i = 1/0;//���д��뱨��
		return "QuanJuBuHuo";
	}

	// public static void main(String[] args) {
	// //����springboot
	// SpringApplication.run(TestController.class, args);
	// }
}
