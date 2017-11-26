package com.bjsxt.service;

import com.bjsxt.dao.LogDAO;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.Log;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component("userService")
public class UserService {
	
	private UserDAO userDAO;
	private LogDAO logDAO;
	public void init() {
		System.out.println("init");
	}

	@Transactional
	public void add(User user) {

		userDAO.save(user);
		Log log = new Log();
		log.setMessage("a user saved!");
		logDAO.save(log);
	}

	public LogDAO getLogDAO() {
		return logDAO;
	}
	@Resource
	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource(name="u")
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

	public void destroy() {
		System.out.println("destroy");
	}
}
