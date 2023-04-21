package com.boot.test.config;

import com.boot.test.entity.MySQLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author msl
 * @version 1.0
 * @create 2023-04-21 14:17
 */
@Configuration
@EnableConfigurationProperties(MySQLConfig.class)
public class MyDataConfiguration {

    @Autowired
    private MySQLConfig mySQLConfig;

}
