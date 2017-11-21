package com.ithlf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ithlf.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@Transactional //事务管理注解
	public int addUser(String name, Integer age) {
		int insertUser = userMapper.insertUser(name, age);
		// (没有添加事物时，报错也会保存到数据库;添加事物时，报错后，数据不会保存到数据库。)
		int i = 1 / 0;//演示错误
		return insertUser;
	};
	
	//使用@Async实现异步调用
	@Async
	public void async(){
		System.out.println("##async##开始执行...2");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("##...i="+i);
		}
		System.out.println("##async##结束执行...3");
	}

}
