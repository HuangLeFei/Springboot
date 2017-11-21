package com.ithlf.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @describe��ȫ�ֲ����쳣(�����쳣)
 * @author��HLF
 * @createTime��2017����9:37:56
 * @version��v1.0 
 * @Accesspath��
 */
@ControllerAdvice // �� controller ��һ�������࣬��õľ�����Ϊȫ���쳣�����������
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)	//��ʾ�����쳣
	@ResponseBody // ��ʾ���ط���json��ʽ
	public Map<String, Object> exceptionHandler() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode", "500");
		result.put("errorMsg", "�ף�ϵͳ���󣡣���");
		return result;
	}
}
