package com.ithlf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @describe：我的第一个Springboot（SpringBoot启动方式1） @author：HLF
 * @createTime：2017下午9:31:47 @version：v1.0
 * @Accesspath：http://localhost:8080/hello
 */
// @RestController springboot 提供了 http refult风格
// @RestController 相当于 Controller每个方法加上 @ResponseBody
// @ResponseBody 返回 所有请求方法返回json格式。
@RestController
// @EnableAutoConfiguration
public class TestController {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "success";
	}

	// 全局捕获异常测试(http://localhost:8080/QuanJuBuHuo)
	@RequestMapping("/QuanJuBuHuo")
	public String QuanJuBuHuo() {
		int i = 1/0;//此行代码报错
		return "QuanJuBuHuo";
	}

	// public static void main(String[] args) {
	// //运行springboot
	// SpringApplication.run(TestController.class, args);
	// }
}
