package com.ithlf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @describe：第二个controller例子
 * @author：HLF
 * @createTime：2017下午8:47:25 
 * @version：v1.0 
 * @Accesspath：http://localhost:8080/hello2
 */
@RestController
//@EnableAutoConfiguration
public class HelloController {
	@RequestMapping("/hello2")
	public String hello2() {
		return "hello2";
	}

	// public static void main(String[] args) {
	// SpringApplication.run(HelloController.class, args);
	// }
}
