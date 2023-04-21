package com.boot.test.interceptors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用常规的方式开发SpringMVC拦截器(01)
 * @author msl
 * @version 1.0
 * @create 2023-04-20 16:27
 */
public class MyInterceptor1 implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(MyInterceptor1.class);


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("preHandle...");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle...");
    }

    /***
     * 完成之后
     * @param httpServletRequest   httpServletRequest
     * @param httpServletResponse httpServletResponse
     * @param o Object
     * @param e  Exception
     * @throws Exception e
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("afterCompletion......");
    }
}
