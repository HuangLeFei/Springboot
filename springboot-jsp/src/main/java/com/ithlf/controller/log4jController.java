package com.ithlf.controller;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @describe��ʹ��log4j��¼��־
 * @author��HLF
 * @createTime��2017����8:00:23 @version��v1.0
 * @Accesspath��http://localhost:8080/log
 */
@RestController
public class log4jController {
	private static final Logger log = Logger.getLogger(log4jController.class);

	@RequestMapping(value = "log")
	public String log4j() {
		log.info("test log4j + ʹ��log4j��¼��־");
		return "success";
	}

	// http://localhost:8080/addUserName?name=hlf
	// ʹ��AOPͳһ����Web������־
	@RequestMapping("/addUserName")
	public String addUserName(@Param("name") String name) {
		return "success";
	}
}
