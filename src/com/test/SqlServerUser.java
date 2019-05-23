package com.test;

/**
 * @ProjectName: abstract-factory
 * @Package: com.test
 * @ClassName: SqlServerUser
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class SqlServerUser {

    private User user;

    /**
     * 插入数据
     * @param user
     */
    public void insert(User user) {
        this.user = user;
        System.out.println("在Sql Server 中User表新增一条数据");
    }

    /**
     * 获取数据
     * @return
     */
    public User getUser() {
        return user;
    }


}
