package com.bjsxt.registeration.service.impl;

import com.bjsxt.registeration.dao.UserDAO;
import com.bjsxt.registeration.dao.impl.UserDAOImpl;
import com.bjsxt.registeration.model.User;
import com.bjsxt.registeration.service.UserManager;

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
