package com.boot.test.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring工具类，为了更方便的获取spring的applicationContext 直接实现接口ApplicationContextAware
 *
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringUtil.class);


    //应用程序上下文
    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null) {
            SpringUtil.applicationContext = applicationContext;
        }

        logger.info(
                "========ApplicationContext配置成功,在普通类可以通过调用" +
                        "SpringUtils.getApplicationContext()获取applicationContext对象,applicationContext="
                        + SpringUtil.applicationContext + "========");
    }


    /**
     * 获取spring上下文
     *
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    public static <T> Object getBean(Class<T> class1) {
        return applicationContext.getBean(class1);
    }

    public static <T> Object getBean(Class<T> class1, String beanName) {
        return applicationContext.getBean(class1, beanName);
    }


}
