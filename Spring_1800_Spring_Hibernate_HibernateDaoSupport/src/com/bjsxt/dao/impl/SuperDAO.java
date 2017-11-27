package com.bjsxt.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SuperDAO extends HibernateDaoSupport {
/*

    @Resource(name = "hibernateTemplate")
    public void setSuperHibernateTemplate(HibernateTemplate hibernateTemplate) {
       super.setHibernateTemplate(hibernateTemplate);
    }
*/

    @Resource(name = "sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
