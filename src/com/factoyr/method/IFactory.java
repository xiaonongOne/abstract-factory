package com.factoyr.method;

import com.abstractfactory.IDepartment;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: IFactory
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
