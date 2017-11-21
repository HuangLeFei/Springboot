package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @describe： 获取application.properties中的参数
 * @author：HLF
 * @createTime：2017下午4:49:22 @version：v1.0 
 * @Accesspath：http://localhost:8080/getValue
 */
@Controller
public class getValueController {
	
	@Value("${name}")
	private String name;

	@ResponseBody
	@RequestMapping("/getValue")
	public String getValue() {
		return name;
	}
}
