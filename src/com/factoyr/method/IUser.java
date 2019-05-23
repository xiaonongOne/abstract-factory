package com.factoyr.method;

import com.test.User;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: IUser
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public interface IUser {

    void insert(User user);

    User getUser();
}
