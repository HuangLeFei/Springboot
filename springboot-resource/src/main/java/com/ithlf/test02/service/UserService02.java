package com.ithlf.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithlf.test02.mapping.UserMapping02;

@Service
public class UserService02 {
	@Autowired
	private UserMapping02 usermapping02;

	public int addUser02(String name, Integer age) {
		return usermapping02.addUser02(name, age);
	};
}
