package com.test;

/**
 * @ProjectName: abstract-factory
 * @Package: com.test
 * @ClassName: Test
 * @Description: 不使用模式我们可以发现代码非常冗余，每次更换一种数据库，就需要写大量的代码。
 *               此时我们可以考虑用工厂方法的模式  定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 *               那就让我们来试试吧。
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        // SQLServer 插入数据库
        SqlServerUser sqlServerUser = new SqlServerUser();
        User user = new User();
        user.setId(1);
        user.setName("测试");
        sqlServerUser.insert(user);
        System.out.println("==========Sql Server获取数据==============");
        System.out.println(sqlServerUser.getUser().getId());
        System.out.println(sqlServerUser.getUser().getName());

        // MySQL 插入数据库
        MySQLUser mySQLUser = new MySQLUser();
        mySQLUser.insert(user);
        System.out.println("==========MySQL获取数据==============");
        System.out.println(mySQLUser.getUser().getId());
        System.out.println(mySQLUser.getUser().getName());
    }
}
