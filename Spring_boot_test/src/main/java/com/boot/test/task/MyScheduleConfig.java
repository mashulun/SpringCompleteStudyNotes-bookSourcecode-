package com.boot.test.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Configuration //声明类为系统配置类
@EnableScheduling //开启调度任务
public class MyScheduleConfig {

    private static final Logger logger = LoggerFactory.getLogger(MyScheduleConfig.class);


    /***
     * CronExpress 表达式
     */
    // @Scheduled(cron = "0 0/1 * * * ?") // 定义调度器
    public void job1() {
        logger.info("this is my first job execute");
    }


}
