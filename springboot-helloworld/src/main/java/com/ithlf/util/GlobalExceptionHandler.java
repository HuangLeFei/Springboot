package com.ithlf.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @describe：全局捕获异常(拦截异常)
 * @author：HLF
 * @createTime：2017下午9:37:56
 * @version：v1.0 
 * @Accesspath：
 */
@ControllerAdvice // 是 controller 的一个辅助类，最常用的就是作为全局异常处理的切面类
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)	//表示拦截异常
	@ResponseBody // 表示拦截返回json格式
	public Map<String, Object> exceptionHandler() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode", "500");
		result.put("errorMsg", "亲，系统错误！！！");
		return result;
	}
}
