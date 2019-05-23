package com.factoyr.method;

import com.abstractfactory.IDepartment;
import com.abstractfactory.MySQLDepartment;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: MySQLFactory
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class MySQLFactory implements  IFactory {
    @Override
    public IUser createUser() {
        return new MySQLUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySQLDepartment();
    }
}
