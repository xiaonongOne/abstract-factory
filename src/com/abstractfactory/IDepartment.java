package com.abstractfactory;

/**
 * @ProjectName: abstract-factory
 * @Package: com.abstractfactory
 * @ClassName: IDepartment
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public interface IDepartment {
    // 插入部门表数据
    void insert(Department department);
    // 获取部门表数据
    Department getDepartment();
}
