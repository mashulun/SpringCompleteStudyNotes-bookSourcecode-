package com.boot.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在普通的控制器和Service业务中也可以直接实现EnvironmentAware
 * 来获取系统环境变量,但是获取系统环境变量的时机为系统加载的时候
 *
 * @author msl
 * @version 1.0
 * @create 2023-04-21 13:50
 */
@RestController
@RequestMapping("/system")
public class SystemEnvironmentController implements EnvironmentAware {


    private static final Logger logger = LoggerFactory.getLogger(SystemEnvironmentController.class);

    private String java_home;


    @RequestMapping(value = "/getJavaHome", method = RequestMethod.GET)
    public String getJava_home() {
        return java_home;
    }


    @Override
    public void setEnvironment(Environment environment) {
        java_home = environment.getProperty("JAVA_HOME");
        logger.info("控制器中获取的系统环境变量:{}", java_home);
    }
}
