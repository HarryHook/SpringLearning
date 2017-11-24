package com.bjsxt.service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;


public class UserService {
    private UserDAO userDAO;
    public void init() {
        System.out.println("init");
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name = "u2")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void destory() {
        System.out.println("destory");
    }
}
