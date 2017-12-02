package com.bjsxt.registration.dao;

import com.bjsxt.registration.model.User;

import java.util.List;

public interface UserDAO {
    public void save(User user);

    public boolean checkUserExistByName(String name);

    public List<User> getUsers();

    public User loadById(int id);
}
