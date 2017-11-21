package com.ithlf.controller;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @describe：使用log4j记录日志
 * @author：HLF
 * @createTime：2017下午8:00:23 @version：v1.0
 * @Accesspath：http://localhost:8080/log
 */
@RestController
public class log4jController {
	private static final Logger log = Logger.getLogger(log4jController.class);

	@RequestMapping(value = "log")
	public String log4j() {
		log.info("test log4j + 使用log4j记录日志");
		return "success";
	}

	// http://localhost:8080/addUserName?name=hlf
	// 使用AOP统一处理Web请求日志
	@RequestMapping("/addUserName")
	public String addUserName(@Param("name") String name) {
		return "success";
	}
}
