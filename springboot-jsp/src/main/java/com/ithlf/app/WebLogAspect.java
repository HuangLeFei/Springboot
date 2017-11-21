package com.ithlf.app;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 
 * @describe��ʹ��AOPͳһ����Web������־
 * @author��HLF
 * @createTime��2017����8:13:40 @version��v1.0 @Accesspath��
 */

@Aspect // ����һ������
@Component // ע�뵽����
public class WebLogAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Pointcut("execution(public * com.ithlf.controller..*.*(..))") // ��ʾ���嵽�����·����������
	public void webLog() {
	}

	@Before("webLog()") // ��ȡ��request���󣬴�ӡ��־
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// ���յ����󣬼�¼��������
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// ��¼����������
		logger.info("URL : " + request.getRequestURL().toString());
		logger.info("HTTP_METHOD : " + request.getMethod());
		logger.info("IP : " + request.getRemoteAddr());
		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			logger.info("name:{},value:{}", name, request.getParameter(name));
		}
	}

	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// ���������󣬷�������
		logger.info("RESPONSE : " + ret);
	}
}
