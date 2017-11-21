package com.hlf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 	* @describe：SpringBoot yml 使用
 	* @author：HLF
 	* @createTime：2017下午5:19:36
 	* @version：v1.0
	* @Accesspath：http://localhost:8090/ithlf/indexYml
 */
@RestController
//@EnableAutoConfiguration
public class IndexController {

	@RequestMapping("/indexYml")
	public String indexYml(){
		System.out.println("SpringBoot yml 使用");
		return "success";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}
}
