package com.boot.test.interceptors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用常规的方式开发SpringMVC拦截器(02)
 * @author msl
 * @version 1.0
 * @create 2023-04-20 16:50
 */
public class MyInterceptor2 implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(MyInterceptor2.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        logger.info("MyInterceptor2 中 preHandle....");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("MyInterceptor2 中 postHandle....");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("MyInterceptor2 中 afterCompletion....");
    }
}
