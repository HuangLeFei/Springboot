package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ithlf.entity.UserEntity;
import com.ithlf.repository.UserRepository;

/**
 * 
 	* @describe：springboot整合使用springjpa
 	* @author：HLF
 	* @createTime：2017下午9:30:15
 	* @version：v1.0
	* @Accesspath：http://localhost:8080/jpaIndex?id=1
 */
@RestController
public class JpaController {
	
	@Autowired
	private UserRepository ur;
	
	@RequestMapping("/jpaIndex")
	public String jpaIndex(Integer id) {
		UserEntity userEntity = ur.findOne(id);
		System.out.println(userEntity.toString());
		return userEntity.toString();
	}
}
