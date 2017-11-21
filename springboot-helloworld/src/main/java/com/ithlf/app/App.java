package com.ithlf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 	* @describe：SpringBoot启动方式2(通过扫包的方式请求controller，如访问 HelloController.java，HLFController.java)
 	* @author：HLF
 	* @createTime：2017下午9:11:27
 	* @version：v1.0
	* @Accesspath：http://localhost:8080/hello2
	* Springboot访问静态图片路径：http://localhost:8080/imgs/1.jpg  不需要加/static
 */
@ComponentScan(basePackages="com.ithlf.controller,com.ithlf.util")
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
