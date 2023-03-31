package com.boot.test;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 其中@SpringBootApplication
 * 申明让 spring boot 自动给程序进行必要的配置，等价于以默认属性使用@Configuration
 * 和@EnableAutoConfiguration 和  @ComponentScan
 *
 * @author Msl
 * @create 2022-04-27 15:45
 */
@SpringBootApplication
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// @ServletComponentScan
// @Import(value = {SpringsUtil.class})
public class App extends WebMvcConfigurerAdapter {
    //配置fastjson
    @Bean
    public HttpMessageConverters faMessageConverters() {
        return new HttpMessageConverters(new FastJsonHttpMessageConverter());
    }


    /**注册 Spring Util
     * 这里为了和上一个冲突，所以方面名为：springUtil2
     * 实际中使用 springUtil
     */
    // @Bean
    // public SpringUtil springUtil2(){return	new	SpringUtil();}


    /****
     * 参数里 VM 参数设置为：
     *  -javaagent:.\lib\spring loaded-1.2.4.RELEASE.jar	-noverify
     * 启动
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
