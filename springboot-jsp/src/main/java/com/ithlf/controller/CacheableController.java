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
 * @describe：缓存支持-注解配置与EhCache使用
 * @author：HLF
 * @createTime：2017下午9:20:35 @version：v1.0 
 * @Accesspath：http://localhost:8080/getUsers?id=1
 * 例如：查询了id=1的数据，后删除id=1 结果也可以查到id=1的数据
 */
@Controller
public class CacheableController {
	@Autowired
	private UserMapper UserMapper;

	@Autowired
	private CacheManager cacheManager;//缓存中使用删除
	
	@ResponseBody
	@RequestMapping("/getUsers")
	public String getUsers(int id) {
		return UserMapper.selectUser(id).toString();
	}
	
	//清除缓存（从数据库读取数据）
	//http://localhost:8080/removeKey
	@ResponseBody
	@RequestMapping("/removeKey")
	public String removeKey(){
		cacheManager.getCache("baseCache").clear();//对应ehcache.xml中的baseCache值
		return "success";
	}
}
