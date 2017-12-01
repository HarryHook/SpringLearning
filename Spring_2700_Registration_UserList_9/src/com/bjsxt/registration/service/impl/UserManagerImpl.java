package com.bjsxt.registration.service.impl;

import com.bjsxt.registration.dao.UserDAO;
import com.bjsxt.registration.model.User;
import com.bjsxt.registration.service.UserManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/*
管理实例，比如查询 User是否存在
 */
@Component("userManager")
public class UserManagerImpl implements UserManager {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }
    @Resource
    public void setUserDAO(UserDAO userDao) {
        this.userDAO = userDao;
    }

    @Override
    public boolean exists(User user) throws Exception {
        return userDAO.checkUserExistByName(user.getUsername());
    }

    @Override
    public void add(User user) throws Exception {
        userDAO.save(user);
    }

    @Override
    public List<User> getUsers() {
        return this.userDAO.getUsers();
    }
}
