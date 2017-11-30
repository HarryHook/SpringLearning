package com.bjsxt.registeration.service;

import com.bjsxt.registeration.model.User;

public interface UserManager {
    boolean exists(User user) throws Exception;

    void add(User user) throws Exception;
}