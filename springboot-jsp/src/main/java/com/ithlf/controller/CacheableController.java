package com.ithlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ithlf.entity.UserEntity;
import com.ithlf.mapper.UserMapper;

/**
 * 
 * @describe������֧��-ע��������EhCacheʹ��
 * @author��HLF
 * @createTime��2017����9:20:35 @version��v1.0 
 * @Accesspath��http://localhost:8080/getUsers?id=1
 * ���磺��ѯ��id=1�����ݣ���ɾ��id=1 ���Ҳ���Բ鵽id=1������
 */
@Controller
public class CacheableController {
	@Autowired
	private UserMapper UserMapper;

	@Autowired
	private CacheManager cacheManager;//������ʹ��ɾ��
	
	@ResponseBody
	@RequestMapping("/getUsers")
	public String getUsers(int id) {
		return UserMapper.selectUser(id).toString();
	}
	
	//������棨�����ݿ��ȡ���ݣ�
	//http://localhost:8080/removeKey
	@ResponseBody
	@RequestMapping("/removeKey")
	public String removeKey(){
		cacheManager.getCache("baseCache").clear();//��Ӧehcache.xml�е�baseCacheֵ
		return "success";
	}
}
