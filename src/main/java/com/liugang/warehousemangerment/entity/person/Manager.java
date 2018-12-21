package com.liugang.warehousemangerment.entity.person;

import java.io.Serializable;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.entity.person
 * @projectName warehouse-mangerment
 * 管理员的实体类
 */
public class Manager {
    private Integer managerId;
    private String managerName;
    private String password;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
