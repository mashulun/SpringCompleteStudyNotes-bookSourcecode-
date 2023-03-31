package com.boot.test.controller;

import com.boot.test.po.DemoPO;
import com.boot.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试json返回控制器
 *
 * @author Msl
 * @create 2022-04-28 17:09
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;


    /***
     * 返回 demo 数据:
     * 请求地址：<a href="http://127.0.0.1:8080/demo/getDemo">...</a>
     * @return DemoPO
     */
    @RequestMapping("/getDemo")
    public DemoPO getDemo() {
        DemoPO demo = new DemoPO();
        demo.setId(1L);
        demo.setName("Zjs");
        System.out.println("****");
        return demo;
    }


    /***
     * 返回错误实例
     * @return
     */
    @RequestMapping("/zeroException")
    public int zeroException() {
        return 100 / 0;
    }


    /***
     * 保存数据
     * @param demoPO
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public String save(DemoPO demoPO) {
        demoService.save(new DemoPO(1L, "angle"));
        return "ok the data was saved";
    }

    @RequestMapping("/show")
    @ResponseBody
    public DemoPO showDemo(@RequestParam(name = "no",defaultValue = "1",required = true) Long id){
        return demoService.getById(id);
    }


}
