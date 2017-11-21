package com.ithlf.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @describe��������controller����
 * @author��HLF
 * @createTime��2017����8:47:25 @version��v1.0
 * @Accesspath��http://localhost:8080/hello3
 */
@RestController
//@EnableAutoConfiguration
public class HLFController {
	@RequestMapping("/hello3")
	public String hello2() {
		return "hello3";
	}

	// public static void main(String[] args) {
	// SpringApplication.run(HelloController.class, args);
	// }
}
