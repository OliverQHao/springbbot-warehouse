package com.liugang.warehousemangerment.service.person;

import com.liugang.warehousemangerment.entity.person.Manager;

import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.service.person
 * @projectName warehouse-mangerment
 */
public interface ManagerService {

    public Manager getManagerById(Integer id);

    public List<Manager> getAllManagers();
}
