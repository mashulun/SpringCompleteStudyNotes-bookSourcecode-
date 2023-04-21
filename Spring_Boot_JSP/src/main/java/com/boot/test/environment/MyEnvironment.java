package com.boot.test.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 *
 * 读取Spring以及系统环境变量
 * 主要 @Configuration,
 * 实现接口: EnvironmentAware
 * 就能获取到系统环境信息
 * @author msl
 * @version 1.0
 * @create 2023-04-21 13:22
 */
@Configuration
public class MyEnvironment  implements EnvironmentAware {

    private static final Logger logger = LoggerFactory.getLogger(MyEnvironment.class);

    /***
     * jdbcUrl地址
     * 使用el表达式读取spring主配置文件
     */
    @Value("${spring.datasource.url}")
    private String jdbcUrl;


    @Override
    public void setEnvironment(Environment environment) {
        //springEL表达式获取的值
        logger.info("springEL表达式获取的值:{}",jdbcUrl);

        //获取系统属性:
        logger.info("JAVA_HOME:{}",environment.getProperty("JAVA_HOME"));

        //获取spring主配置文件按中的属性
        logger.info("spring.datasource.url:{}",environment.getProperty("spring.datasource.url"));

        //获取前缀是"spring.datasource"的所有属性值
        RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(environment,"spring.datasource.");

        logger.info("通过前缀获取的url:{}",propertyResolver.getProperty("url"));

        logger.info("通过前缀获取的driverClassName:{}",propertyResolver.getProperty("driverClassName"));
    }
}
