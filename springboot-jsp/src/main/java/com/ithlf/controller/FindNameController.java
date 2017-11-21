package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ithlf.entity.UserEntity;
import com.ithlf.mapper.UserMapper;

/**
 * 
 * @describe��springboot����ʹ��mybatis
 * @author��HLF
 * @createTime��2017����8:34:35 
 * @version��v1.0 
 * @Accesspath��http://localhost:8080/getUsername?name=���ַ�
 */

@Controller

public class FindNameController {
	
	@Autowired
	private UserMapper um;

	@RequestMapping("/getUsername")
	@ResponseBody
	public UserEntity getUsername(String name) {
		return um.findName(name);
	}
}
