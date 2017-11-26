package com.bjsxt.dao.impl;

import com.bjsxt.dao.LogDAO;
import com.bjsxt.model.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("logDAO")
public class LogDAOImpl implements LogDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Log log) {
		
		Session s = sessionFactory.openSession();
		s.save(log);
		throw new RuntimeException("RuntimeException !");
	}

}
