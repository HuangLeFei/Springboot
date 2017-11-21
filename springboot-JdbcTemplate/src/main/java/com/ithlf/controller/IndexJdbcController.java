package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithlf.service.UserService;

/**
 * 
 * @describe��springboot��������JDBC
 * @author��HLF
 * @createTime��2017����8:28:45 @version��v1.0
 * @Accesspath��http://localhost:8080/indexJdbc
 */
@RestController
@EnableAutoConfiguration
public class IndexJdbcController {

	@Autowired
	private UserService us;

	@RequestMapping("/indexJdbc")
	public String indexJdbc() {
		System.out.println("springboot����ʹ��JdbcTemplate");
		us.createJDBC();//���浽���ݿ�
		System.out.println("�ɹ���ӵ����ݿ⣡����");
		return "indexJdbc";
	}

	// public static void main(String[] args) {
	// SpringApplication.run(IndexJdbcController.class, args);
	// }
}
