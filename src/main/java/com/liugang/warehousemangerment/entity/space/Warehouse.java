package com.liugang.warehousemangerment.entity.space;

import com.liugang.warehousemangerment.entity.person.Manager;

import java.io.Serializable;

/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.entity.space
 * @projectName warehouse-mangerment
 * 库区的实体类
 */
public class Warehouse {
    private String warehouseID;//库区号
    private String warehouseType;//库区的类型
    private String warehouseName;//库区的名称
    private String position;//库区的位置
    private Manager manager;//库区的管理员

    public String getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(String warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseID='" + warehouseID + '\'' +
                ", warehouseType='" + warehouseType + '\'' +
                ", warehouseName='" + warehouseName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
