package com.boot.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  HelloWorld实战详解
 * @author Msl
 * @create 2022-04-27 15:49
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    private String hello() {
        return "Hello World";
    }

}
