package com.bjsxt.registration.action;

import com.bjsxt.registration.model.User;
import com.bjsxt.registration.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAction extends ActionSupport {

    private String username;
    private String password;
    private String password2;

    private UserManager userManager;

    public UserAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        userManager =(UserManager) context.getBean("userManager");
    }

    @Override
    public String execute() throws Exception {
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        if(userManager.exists(u)) {
            return "fail";
        }
        userManager.add(u);
        return "success";
    }

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

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }


    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }


}
