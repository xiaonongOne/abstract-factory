package com.factoyr.method;

import com.test.User;

import javax.jws.soap.SOAPBinding;

/**
 * @ProjectName: abstract-factory
 * @Package: com.factoyr.method
 * @ClassName: Test
 * @Description:
 *              通过完成工厂模式我们发现把new SqlServerFacetory 更改new MySQLFactory就解决代码的冗余。
 *              这就是业务逻辑和数据访问的解耦，如果增加其他表还是会增加很多类，接下来我们看看抽象工厂模式。
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setId(2);
        user.setName("工厂方法模式");
        // 若要改成MySQL 只需要更改这一句就可以啦
        IFactory factory = new SqlServerFactory();
        // IFactory factory = new MySQLFactory();
        IUser iu = factory.createUser();

        iu.insert(user);
        User user2 =  iu.getUser();
        System.out.println(" id:"+user2.getId()+" name:"+user2.getName());
    }
}
