package com.bjsxt.registeration.dao.impl;

import com.bjsxt.registeration.dao.UserDAO;
import com.bjsxt.registeration.model.User;
import com.bjsxt.registeration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
    }

    @Override
    public boolean checkUserExistByName(String username) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        long count = (long) s.createQuery("select count (*) from User user where user.username= :username")
                .setString("username", username)
                .uniqueResult();
        s.getTransaction().commit();
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

}
