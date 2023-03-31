package com.boot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * thymeleaf模板引擎控制器
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/helloHtml")
    public String hello(Map<String,Object> map){
        map.put("hello", "this data is from backing server");
        return "helloHtml";
    }




}
