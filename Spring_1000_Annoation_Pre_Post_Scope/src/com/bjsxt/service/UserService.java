package com.bjsxt.service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//默认类名首字母小写，也可以自己指定
@Component("userService")
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

    @Resource(name = "userDAO")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void destory() {
        System.out.println("destory");
    }
}
