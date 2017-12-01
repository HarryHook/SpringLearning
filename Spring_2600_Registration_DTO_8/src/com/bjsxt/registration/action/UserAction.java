package com.bjsxt.registration.action;

import com.bjsxt.registration.model.User;
import com.bjsxt.registration.service.UserManager;
import com.bjsxt.registration.vo.UserRegisterInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("user")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven {

    private UserRegisterInfo userInfo = new UserRegisterInfo();

    private UserManager userManager;


    @Override
    public String execute() throws Exception {
        User u = new User();
        u.setUsername(userInfo.getUsername());
        u.setPassword(userInfo.getPassword());
        if(userManager.exists(u)) {
            return "fail";
        }
        userManager.add(u);
        return "success";
    }

    public UserManager getUserManager() {
        return userManager;
    }
    @Resource
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public UserRegisterInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserRegisterInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public Object getModel() {
        return userInfo;
    }
}
