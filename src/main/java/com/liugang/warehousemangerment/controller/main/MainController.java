package com.liugang.warehousemangerment.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.controller.main
 * @projectName warehouse-mangerment
 */
@Controller
public class MainController {


    @RequestMapping(value = {"/", "/index.html"})
    public String index(){
        //模板引擎为我们寻找到classpath:/templates/index.html页面返回
        return "index";
    }

    @RequestMapping(value = {"/login"})
    public String login(){
        //模板引擎为我们寻找到classpath:/templates/login.html页面返回
        return "login";
    }

    @RequestMapping(value = {"/update"})
    public String update(){
        //模板引擎为我们寻找到classpath:/templates/update.html页面返回
        return "update";
    }
}
