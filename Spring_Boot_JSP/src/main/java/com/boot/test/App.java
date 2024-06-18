package com.boot.test;

import com.boot.test.entity.MySQLConfig;
import com.boot.test.properties.MyConfig;
import com.boot.test.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 *
 *大家也许会看到有些demo使用了3个注解： @Configuration；
 *  @ EnableAutoConfiguration
 *  @ ComponentScan 其实：@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
 * 等价于以默认属性使用@Configuration，
 *  @ EnableAutoConfig

 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@ServletComponentScan // 方式二： 添加servlet 注册扫描，将自动注册添加了@WebServlet的类为serlvet
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@EnableConfigurationProperties({MyConfig.class})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    /***
     * 注册Servlet.不需要添加注解：@ServletComponentScan
     * 这种方式已经在springboot中废弃
     * @ return
     */
    //public ServletRegistrationBean registrationBean1(){
    //    return new ServletRegistrationBean(new MyServlet1(),"/myServlet");
    //}


}
