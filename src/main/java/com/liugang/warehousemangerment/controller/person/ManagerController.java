package com.liugang.warehousemangerment.controller.person;

import com.liugang.warehousemangerment.entity.person.Manager;
import com.liugang.warehousemangerment.service.person.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.controller.person
 * @projectName warehouse-managerment
 * 处理管理员的接口
 */
@Controller
@RequestMapping(value = "/manager")
public class ManagerController {


    @Resource(name = "managerService")
    private ManagerService managerService;

    //根据id返回manager的接口
    @ResponseBody
    @RequestMapping(value = "/get", produces = {"application/json;charset=UTF-8"})
    public Manager getManagerById(@RequestParam(value = "id",required = true) Integer id){
        Manager manager = managerService.getManagerById(id);
        return manager;
    }

    //返回所有的managers的接口
    @ResponseBody
    @RequestMapping(value = "/getAll", produces = {"application/json;charset=UTF-8"})
    public List<Manager> getAllManagers(){
        List<Manager> allManagers = managerService.getAllManagers();
        return allManagers;
    }
}
