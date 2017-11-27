package com.bjsxt.dao.impl;

import com.bjsxt.dao.LogDAO;
import com.bjsxt.model.Log;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

//@Component("logDAO")
public class LogDAOImpl extends HibernateDaoSupport implements LogDAO {


    public void save(Log log) {
//        this.save(log);
		this.getHibernateTemplate().save(log);
    }

}
