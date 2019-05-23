package com.abstractfactory;

/**
 * @ProjectName: abstract-factory
 * @Package: com.abstractfactory
 * @ClassName: MySQLDepartment
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class MySQLDepartment implements IDepartment {

    private Department department;


    @Override
    public void insert(Department department) {
        this.department = department;
        System.out.println("在Mysql 中department表新增一条数据");
    }

    @Override
    public Department getDepartment() {
        return department;
    }
}
