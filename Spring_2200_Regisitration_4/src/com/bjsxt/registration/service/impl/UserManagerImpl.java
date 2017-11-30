package com.bjsxt.registration.service.impl;

import com.bjsxt.registration.dao.UserDAO;
import com.bjsxt.registration.dao.impl.UserDAOImpl;
import com.bjsxt.registration.model.User;
import com.bjsxt.registration.service.UserManager;

/*
管理实例，比如查询 User是否存在
 */
public class UserManagerImpl implements UserManager {
    private UserDAO userDAO = new UserDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean exists(User user) throws Exception {
        return userDAO.checkUserExistByName(user.getUsername());
    }

    @Override
    public void add(User user) throws Exception {
        userDAO.save(user);
    }
}
