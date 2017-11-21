package com.ithlf.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 	* @describe：使用@Scheduled创建定时任务
 	* @author：HLF
 	* @createTime：2017下午4:20:55
 	* @version：v1.0
	* @Accesspath：
 */
@Component
public class ScheduledTasks {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	//每秒执行一次
	@Scheduled(fixedRate = 1000)
	public void add() {
		System.out.println("我正在使用@Scheduled创建定时任务"+System.currentTimeMillis());
	}
	
	//每5秒执行一次
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
