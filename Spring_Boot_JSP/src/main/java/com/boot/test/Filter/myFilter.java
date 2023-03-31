package com.boot.test.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 使用注解定义一个过滤器
 * @author masl
 * @version 1.0
 * @data 2023-03-20
 */
@WebFilter(urlPatterns = "/*",filterName = "myFilter")
public class myFilter  implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(myFilter.class);


    /***
     * 销毁
     */
    @Override
    public void destroy() {
        logger.info("destroy()");
    }

    /***
     * 做过滤
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("doFilter()");
        logger.info("before filter");
        chain.doFilter(request, response);
        logger.info("after filter");
    }

    /***
     * 初始化
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig config) throws ServletException {
        logger.info("init()");
    }
}
