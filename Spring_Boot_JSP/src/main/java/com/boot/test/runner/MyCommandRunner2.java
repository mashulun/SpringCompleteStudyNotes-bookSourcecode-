package com.boot.test.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author msl
 * @version 1.0
 * @create 2023-04-21 10:41
 */
@Component
@Order(value = 2)
public class MyCommandRunner2 implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyCommandRunner2.class);

    /****
     * 系统启动即会执行Run方法
     * @param strings
     * @throws Exception
     */
    @Override
    public void run(String... strings) throws Exception {
        logger.info("执行启动任务******02");
    }
}
