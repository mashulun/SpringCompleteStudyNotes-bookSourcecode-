package com.boot.test.properties;

/**
 * // 读取系统配置文件中的person开头的所有配置，并自动封装到实体类中
 *
 * @author msl
 * @version 1.0
 * @create 2023-04-21 15:20
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
//@ConfigurationProperties(prefix = "person")
public class MyConfig {


    private String name;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public MyConfig() {

    }

    public MyConfig(String name, String gender) {
        super();
        this.gender = gender;
        this.name = name;
    }

}
