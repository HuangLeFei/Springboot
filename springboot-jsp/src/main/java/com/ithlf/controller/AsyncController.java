package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithlf.service.UserService;

/**
 * 
 * @describe��ʹ��@Asyncʵ���첽����
 * @author��HLF
 * @createTime��2017����4:26:13 @version��v1.0 @Accesspath��
 */
@RestController
public class AsyncController {
	
	@Autowired
	private UserService us;
	
	//û�м��첽ע��ʱ��ִ��˳����1234
	//���첽ע��ʱ��ִ��˳����1423  ӦΪ14�����̣߳�23�����߳�
	@RequestMapping("/async")
	public String async() {
		System.out.println("###AsyncController###...1");
		us.async();
		System.out.println("###AsyncController###...4");
		return "success";
	}
}
