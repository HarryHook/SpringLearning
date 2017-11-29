package com.bjsxt.registeration.dao;

import com.bjsxt.registeration.model.User;

public interface UserDAO {
    public void save(User user);
    public boolean checkUserExistByName(String name);
}
