package com.factoyr.method;

import com.abstractfactory.IDepartment;
import com.abstractfactory.SqlServerDepartment;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: SqlServerFactory
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class SqlServerFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
