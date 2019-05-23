package com.abstractfactory;

import com.factoyr.method.IFactory;
import com.factoyr.method.IUser;
import com.factoyr.method.SqlServerFactory;
import com.test.User;

/**
 * @ProjectName: abstract-factory
 * @Package: com.abstractfactory
 * @ClassName: Test
 * @Description: 大家可能会觉得奇怪，这不就是工厂方法模式
 *               实际上有一个User操作类只需要使用工厂方法模式，但显然涉及到多张表，
 *               SqlServer 和MySQL是两个大的分类，所以这种解决涉及多个产品问题的叫做抽象工厂模式。
 *
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setId(2);
        user.setName("抽象工厂模式");
        Department department = new Department();
        department.setId(3);
        department.setName("抽象工厂部门");

        // 若要改成MySQL 只需要更改这一句就可以啦
        IFactory factory = new SqlServerFactory();
        // IFactory factory = new MySQLFactory();
        IUser iu = factory.createUser();

        iu.insert(user);
        User user2 =  iu.getUser();
        System.out.println(" id:"+user2.getId()+" name:"+user2.getName());

        IDepartment im = factory.createDepartment();
        im.insert(department);
        Department de = im.getDepartment();
        System.out.println("id:"+de.getId()+" name: "+de.getName());

    }
}
