package com.liugang.warehousemangerment.mapper.person;


import com.liugang.warehousemangerment.entity.person.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Lazy;

import java.util.List;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.mapper.person
 * @projectName warehouse-mangerment
 */
@Mapper
@Lazy
public interface ManagerMapper {

    public Manager getManagerById(Integer id);

    public List<Manager> getAllManagers();
}
