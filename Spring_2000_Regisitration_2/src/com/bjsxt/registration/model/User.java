package com.bjsxt.registration.model;

/*
    只有get*(), set*()方法的称为贫血模型
    充血模型：还有其他的业务逻辑
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
