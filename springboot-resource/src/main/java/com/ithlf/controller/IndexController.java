package com.ithlf.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithlf.test01.service.UserService01;
import com.ithlf.test02.service.UserService02;

/**
 * 
 * @describe��springboot���϶�����Դ
 * @author��HLF
 * @createTime��2017����9:15:19 @version��v1.0
 * @Accesspath��http://localhost:8080/addUsers
 */
@RestController
public class IndexController {
	private static Logger log = Logger.getLogger(IndexController.class);

	@Autowired
	private UserService01 userservice01;
	@Autowired
	private UserService02 userservice02;

	@RequestMapping("/addUsers")
	public String addUsers() {
		// @Param("name") String name, @Param("age") Integer age
		System.out.println("�����ˣ�����");
		// �ֱ���ӱ��浽��ͬ����Դ�����ݿ�
		// userservice01.addUser01("test01", 20);
		// userservice02.addUser02("twst02", 20);
		return "success";
	}

	// ���Զ�����Դ�е�������� �������Ƿ񱣴浽���ݿ�1�����ݿ�2��
	// localhost:8080/addUser01AndUser2
	@RequestMapping("/addUser01AndUser2")
	public String addUser1AndUser2() {
		userservice01.addUser1AndUser2();
		return "success";
	}
}
