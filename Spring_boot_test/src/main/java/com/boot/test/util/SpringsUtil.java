package com.boot.test.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
public class SpringsUtil  implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringsUtil.class);

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(SpringsUtil.applicationContext == null){
            SpringsUtil.applicationContext = applicationContext;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------simple.plugin.spring.SpringsUtil-------------------------------------- ----------------");
        System.out.println("========ApplicationContext 配置成功 , 在普通类可以通过调用 SpringUtils.getAppContext() " +
                "获 取 applicationContext 对 象,applicationContext="+SpringsUtil.applicationContext+"========");
        System.out.println("---------------------------------------------------------------------");
    }


    //获取 applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    //通过 name 获取 Bean
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    //通过 name,以及 Clazz 返回指定的 Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}
