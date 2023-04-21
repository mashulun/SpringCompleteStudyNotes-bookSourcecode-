package com.boot.test.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * 为了实现服务器启动即执行某些操作
 * 只需要实现SpringBoot中的CommandLineRunner接口即可
 * @author msl
 * @version 1.0
 * @create 2023-04-21 10:27
 */
@Component
@Order(value = 1)
public class MyCommandRunner1 implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyCommandRunner1.class);

    /***
     * 系统启动即会执行Run方法
     * @param strings
     * @throws Exception
     */
    @Override
    public void run(String... strings) throws Exception {
        logger.info("执行启动任务*******01");
    }
}
