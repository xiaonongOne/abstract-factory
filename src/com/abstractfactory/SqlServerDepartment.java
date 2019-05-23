package com.abstractfactory;

/**
 * @ProjectName: abstract-factory
 * @Package: com.abstractfactory
 * @ClassName: SqlServerDepartment
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class SqlServerDepartment implements IDepartment {

    private Department department;

    @Override
    public void insert(Department department) {
        this.department = department;
        System.out.println("在Sql Server 中department表新增一条数据");
    }

    @Override
    public Department getDepartment() {
        return department;
    }
}
