package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithlf.service.UserService;

/**
 * 
 * @describe��springboot�����������(springbootĬ�ϼ�������,
 * ֻ��Ҫ�ڷ����ϼ���@Transactional����) @author��HLF
 * @createTime��2017����10:03:52 
 * @version��v1.0 
 * @Accesspath��http://localhost:8080/addUser?name=%E5%B0%8F%E7%B1%B3&age=19
 * @Accesspath��http://localhost:8080/addUser?name=%E5%B0%8Fhua&age=21
 */
@RestController
public class TransactionalController {

	@Autowired
	private UserService us;

	@RequestMapping("/addUser")
	public String addUser(String name, Integer age) {
		us.addUser(name, age);
		return "success";
	}
}
