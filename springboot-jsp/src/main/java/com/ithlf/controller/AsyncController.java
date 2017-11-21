package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithlf.service.UserService;

/**
 * 
 * @describe：使用@Async实现异步调用
 * @author：HLF
 * @createTime：2017下午4:26:13 @version：v1.0 @Accesspath：
 */
@RestController
public class AsyncController {
	
	@Autowired
	private UserService us;
	
	//没有加异步注解时，执行顺序是1234
	//加异步注解时，执行顺序是1423  应为14是主线程，23是子线程
	@RequestMapping("/async")
	public String async() {
		System.out.println("###AsyncController###...1");
		us.async();
		System.out.println("###AsyncController###...4");
		return "success";
	}
}
