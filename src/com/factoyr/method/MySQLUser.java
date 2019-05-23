package com.factoyr.method;

import com.test.User;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: MySQLUser
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class MySQLUser implements  IUser {

    private User user;

    @Override
    public void insert(User user) {
        this.user = user;
        System.out.println("在MySQL 中User表新增一条数据");
    }

    @Override
    public User getUser() {
        return user;
    }
}
