package com.boot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 开发控制器，该控制器将返回到JSP视图
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Controller("/HelloJSP")
public class HelloJSPController {

    @RequestMapping("/index")
    public String hello(ModelMap map){
        map.put("message", "this data is from the backing server");
        return "index";
    }
}
