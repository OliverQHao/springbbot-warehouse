package com.liugang.warehousemangerment.service.space;

import com.liugang.warehousemangerment.entity.space.Warehouse;

import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.service.space
 * @projectName warehouse-mangerment
 * 对库区的接口
 */
public interface WarehouseService {

    //获取所有的库区
    public List<Warehouse> getAllWarehouses();

    //根据库区的id来获取对应的库区
    public Warehouse getWarehouseById(String id);
}
