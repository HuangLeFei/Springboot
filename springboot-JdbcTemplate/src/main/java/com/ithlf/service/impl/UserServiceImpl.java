package com.ithlf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ithlf.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate JdbcTemplate;
	public void createJDBC() {
		JdbcTemplate.update("insert into users values(2,?,?)", "ª∆¿÷∑…",20);
	}

}
