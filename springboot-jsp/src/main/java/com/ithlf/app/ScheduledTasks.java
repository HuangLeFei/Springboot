package com.ithlf.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 	* @describe��ʹ��@Scheduled������ʱ����
 	* @author��HLF
 	* @createTime��2017����4:20:55
 	* @version��v1.0
	* @Accesspath��
 */
@Component
public class ScheduledTasks {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	//ÿ��ִ��һ��
	@Scheduled(fixedRate = 1000)
	public void add() {
		System.out.println("������ʹ��@Scheduled������ʱ����"+System.currentTimeMillis());
	}
	
	//ÿ5��ִ��һ��
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("����ʱ�䣺" + dateFormat.format(new Date()));
    }
}
