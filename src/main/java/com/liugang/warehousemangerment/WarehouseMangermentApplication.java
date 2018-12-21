package com.liugang.warehousemangerment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动类
 */

@SpringBootApplication
@MapperScan("com.liugang.warehousemangerment.mapper")
public class WarehouseMangermentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseMangermentApplication.class, args);
    }

}

