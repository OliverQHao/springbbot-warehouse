package com.liugang.warehousemangerment.service.space;

import com.liugang.warehousemangerment.entity.space.Warehouse;
import com.liugang.warehousemangerment.mapper.space.WarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.service.space
 * @projectName warehouse-mangerment
 * 库区的接口的实现
 */
@Service(value = "warehouseService")
public class WarehouseServiceImp implements WarehouseService {
    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseMapper.getAllWarehouses();
    }

    @Override
    public Warehouse getWarehouseById(String id) {
        return warehouseMapper.getWarehouseById(id);
    }
}
