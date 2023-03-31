package com.boot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * freemarker 控制器
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {
    @RequestMapping("/hello")
    public String hello(ModelMap map) {
        map.put("message", "this data is from backing server , for freemarker");
        return "helloHtml1";
    }
}
