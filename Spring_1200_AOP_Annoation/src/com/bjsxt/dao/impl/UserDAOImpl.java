package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

//这个类产生的对象可以当做组件来使用
@Component("userDAO")
public class UserDAOImpl implements UserDAO {

    public void save(User user) {
        //Hibernate
        //JDBC
        //XML
        //NetWork
        System.out.println("user saved!");
    }

}
