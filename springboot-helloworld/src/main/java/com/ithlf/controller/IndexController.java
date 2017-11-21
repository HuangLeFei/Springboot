package com.ithlf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @describe：使用Freemarker模板引擎渲染web视图
 * @author：HLF
 * @createTime：2017下午10:11:40 @version：v1.0
 * @Accesspath：http://localhost:8080/index
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("Name", "黄乐飞");
		map.put("sex", 0);//0 男，1 女
		List<String> userlist = new ArrayList<String>();
		userlist.add("张珊珊");
		userlist.add("李四");
		userlist.add("王五");
		userlist.add("小钰");
		map.addAttribute("userlist", userlist);
		return "index";//跳转到templates文件夹的index.ftl文件中
	}
}
