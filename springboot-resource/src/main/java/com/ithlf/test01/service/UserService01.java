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

	//��������Դ2�ᱣ�浽���ݿ⣬����Դ1���ᱣ�浽���ݿ⣨��test01�ļ����£��ܲ���test02�ļ��е����ݿ⣩
	//��Ϊ���ݿ�1��Ĭ�ϵ�����Դ������ֻ�ع����ݿ�1������
	@Transactional//�������ע��
	public int addUser1AndUser2() {
		usermapping02.addUser02("test002", 20);
		int i = 1 / 0;
		System.out.println("���ݿ�01�������..");
		usermapping01.addUser01("test001", 20);
		;
		return 0;
	}
	// �������ᣨ����Դ1������Դ2�����浽���ݿ�
	// @Transactional
	// public int addUser1AndUser2() {
	// usermapping01.addUser01("test002", 20);
	// int i = 1 / 0;
	// System.out.println("���ݿ�01�������..");
	// usermapping02.addUser02("test002", 20);
	// ;
	// return 0;
	// }

}
