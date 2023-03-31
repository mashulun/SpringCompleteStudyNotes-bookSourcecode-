package com.boot.test.Linstener;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author masl
 * @version 1.0
 * @data 2023-03-20
 */
@WebListener
public class myListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(myListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        logger.info("contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("contextDestroyed");
    }
}
