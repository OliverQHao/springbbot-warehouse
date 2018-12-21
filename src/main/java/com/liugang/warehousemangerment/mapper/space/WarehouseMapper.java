package com.liugang.warehousemangerment.mapper.space;

import com.liugang.warehousemangerment.entity.space.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Lazy;

import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.mapper.materal
 * @projectName warehouse-mangerment
 * 库区的映射的mapper类
 */
@Mapper
@Lazy
public interface WarehouseMapper {
    //获取所有的库区
    public List<Warehouse> getAllWarehouses();

    //根据库区的id来获取对应的库区
    public Warehouse getWarehouseById(String id);
}
