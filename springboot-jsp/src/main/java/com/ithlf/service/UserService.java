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

	@Transactional //�������ע��
	public int addUser(String name, Integer age) {
		int insertUser = userMapper.insertUser(name, age);
		// (û���������ʱ������Ҳ�ᱣ�浽���ݿ�;�������ʱ����������ݲ��ᱣ�浽���ݿ⡣)
		int i = 1 / 0;//��ʾ����
		return insertUser;
	};
	
	//ʹ��@Asyncʵ���첽����
	@Async
	public void async(){
		System.out.println("##async##��ʼִ��...2");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("##...i="+i);
		}
		System.out.println("##async##����ִ��...3");
	}

}
