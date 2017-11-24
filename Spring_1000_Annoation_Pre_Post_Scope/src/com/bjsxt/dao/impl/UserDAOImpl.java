package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//这个类产生的对象可以当做组件来使用
@Component("userDAO")
public class UserDAOImpl implements UserDAO {
    private  UserDAO userDAO;

    public UserDAOImpl() {
        System.out.println("construct");
    }

    public UserDAOImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    public void save(User user) {
        //Hibernate
        //JDBC
        //XML
        //NetWork
        System.out.println("user saved!");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }

}
