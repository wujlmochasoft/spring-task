package com.vince.spring.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * create by wujl on 2016年5月24日
 */
@Service
public class TaskJob {

	public void job1() {
		System.out.println("spring-task任务进行中。。。");
	}

	@Scheduled(cron = "0 09 15 * * ?")
    public void job2() {
		System.out.println("spring-task+注解方式定时任务进行中。。。"); 
    }
}
