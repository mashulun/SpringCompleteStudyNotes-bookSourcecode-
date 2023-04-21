package com.boot.test.config;

import com.boot.test.interceptors.MyInterceptor1;
import com.boot.test.interceptors.MyInterceptor2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 重写webmvc配置
 *
 * @author msl
 * @version 1.0
 * @create 2023-04-20 17:06
 */
@Configuration
public class MyWebAppConfig extends WebMvcConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(MyWebAppConfig.class);


    /****
     * 重写添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //重写addInterceptors方法并为拦截器配置拦截规则
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");

        //排除路径
        //registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**").excludePathPatterns("/Hello");
        super.addInterceptors(registry);
    }
}
