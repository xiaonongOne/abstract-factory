package com.factoyr.method;

import com.test.User;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: SqlServerUser
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class SqlServerUser implements  IUser {

    private User user;

    /**
     * 插入数据
     * @param user
     */
    @Override
    public void insert(User user) {
        this.user = user;
        System.out.println("在Sql Server 中User表新增一条数据");
    }

    /**
     * 获取数据
     * @return
     */
    @Override
    public User getUser() {
        return user;
    }
}
