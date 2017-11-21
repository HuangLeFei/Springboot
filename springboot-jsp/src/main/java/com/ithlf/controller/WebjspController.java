package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @describe��Springboot ʹ��JSP��ȾWeb��ͼ
 * @author��HLF
 * @createTime��2017����7:41:45 @version��v1.0 
 * @Accesspath��http://localhost:8080/index
 */
@Controller
@EnableAutoConfiguration
public class WebjspController {
	
	@RequestMapping("/index")
	public String indexjsp() {
		System.out.println("����springboot�е�jspҳ�����ӣ�����");
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebjspController.class, args);
	}
}
