package com.bjsxt.registration.dao.impl;

import com.bjsxt.registration.dao.UserDAO;
import com.bjsxt.registration.model.User;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("userDao")
public class UserDAOImpl implements UserDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(User user) {
        hibernateTemplate.save(user);

    }

    @Override
    public boolean checkUserExistByName(String username) {
        List<User> users =  hibernateTemplate.find("from User u where u.username = '" + username + "'");
        if(users != null && users.size() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<User> getUsers() {

        return (List<User>)hibernateTemplate.find("from User");
    }

}
