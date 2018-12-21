package com.liugang.warehousemangerment.controller.space;

import com.liugang.warehousemangerment.entity.space.Warehouse;
import com.liugang.warehousemangerment.service.space.WarehouseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.controller.space
 * @projectName warehouse-mangerment
 */
@Controller
@RequestMapping(value = "/warehouse")
public class WarehouseController {

    @Resource(name = "warehouseService")
    private WarehouseService warehouseService;

    //根据id获取库区的接口
    @ResponseBody
    @RequestMapping(value = "/get", produces = {"application/json;charset=UTF-8"})
    public Warehouse getWarehouseById(@RequestParam(value = "id",required = true) String id){
        Warehouse warehouse = warehouseService.getWarehouseById(id);
        System.out.println("------------------"+warehouse);
        return warehouse;
    }

    //根据所有库区的接口
    @ResponseBody
    @RequestMapping(value = "/getAll", produces = {"application/json;charset=UTF-8"})
    public List<Warehouse> getAllWarehouses(){
        List<Warehouse> warehouses = warehouseService.getAllWarehouses();
        System.out.println("------------------"+warehouses);
        return warehouses;
    }
}
