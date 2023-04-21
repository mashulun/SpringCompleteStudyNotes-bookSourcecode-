package com.boot.test.service;

import org.springframework.stereotype.Service;

/**
 *
 * 编写测试业务逻辑
 * @author msl
 * @version 1.0
 * @create 2023-04-21 10:50
 */
@Service("HelloService")
public class HelloService {
    public String sayHello(){
        return "helloX";
    }
}
