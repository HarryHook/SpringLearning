package com.bjsxt.registeration.service;

import com.bjsxt.registeration.model.User;
import com.bjsxt.registeration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
管理实例，比如查询 User是否存在
 */
public class UserManager {
    public boolean exists(User user) throws Exception {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        long count = (long) s.createQuery("select count (*) from User user where user.username= :username")
                .setString("username", user.getUsername())
                .uniqueResult();
        s.getTransaction().commit();
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(User user) throws Exception {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
    }
}
