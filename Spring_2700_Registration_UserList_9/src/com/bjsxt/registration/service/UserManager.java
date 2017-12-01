package com.bjsxt.registration.service;

import com.bjsxt.registration.model.User;

import java.util.List;

public interface UserManager {
    boolean exists(User user) throws Exception;

    void add(User user) throws Exception;
    public List<User> getUsers();
}
