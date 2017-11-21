package com.ithlf.test01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ithlf.test01.mapping.UserMapping01;
import com.ithlf.test02.mapping.UserMapping02;

@Service
public class UserService01 {

	@Autowired
	private UserMapping01 usermapping01;
	@Autowired
	private UserMapping02 usermapping02;

	public int addUser01(String name, Integer age) {
		return usermapping01.addUser01(name, age);
	};

	//这样数据源2会保存到数据库，数据源1不会保存到数据库（在test01文件夹下，管不到test02文件夹的数据库）
	//因为数据库1是默认的数据源，所以只回滚数据库1的数据
	@Transactional//添加事物注解
	public int addUser1AndUser2() {
		usermapping02.addUser02("test002", 20);
		int i = 1 / 0;
		System.out.println("数据库01插入完毕..");
		usermapping01.addUser01("test001", 20);
		;
		return 0;
	}
	// 这样不会（数据源1，数据源2）保存到数据库
	// @Transactional
	// public int addUser1AndUser2() {
	// usermapping01.addUser01("test002", 20);
	// int i = 1 / 0;
	// System.out.println("数据库01插入完毕..");
	// usermapping02.addUser02("test002", 20);
	// ;
	// return 0;
	// }

}
