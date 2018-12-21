package com.liugang.warehousemangerment.service.person;

import com.liugang.warehousemangerment.entity.person.Manager;
import com.liugang.warehousemangerment.mapper.person.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.service.person
 * @projectName warehouse-mangerment
 */
@Service(value = "managerService")
public class ManagerServiceImp implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager getManagerById(Integer id) {
        Manager manager = managerMapper.getManagerById(id);
        return manager;
    }

    @Override
    public List<Manager> getAllManagers() {
        List<Manager> allManagers = managerMapper.getAllManagers();
        return allManagers;
    }
}
