package com.ithlf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @describe��ʹ��Freemarkerģ��������Ⱦweb��ͼ
 * @author��HLF
 * @createTime��2017����10:11:40 @version��v1.0
 * @Accesspath��http://localhost:8080/index
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("Name", "���ַ�");
		map.put("sex", 0);//0 �У�1 Ů
		List<String> userlist = new ArrayList<String>();
		userlist.add("��ɺɺ");
		userlist.add("����");
		userlist.add("����");
		userlist.add("С��");
		map.addAttribute("userlist", userlist);
		return "index";//��ת��templates�ļ��е�index.ftl�ļ���
	}
}
