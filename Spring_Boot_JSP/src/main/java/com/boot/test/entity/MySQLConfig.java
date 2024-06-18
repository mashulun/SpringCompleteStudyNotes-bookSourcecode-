package com.boot.test.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author msl
 * @version 1.0
 * @create 2023-04-21 14:18
 */


@ConfigurationProperties(prefix = "spring.datasource")
public class MySQLConfig {

    private String url;


    private String username;

    private String password;

    private String driverClassName;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Override
    public String toString() {
        return "MySQLConfig{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}
