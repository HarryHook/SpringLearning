package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

@Component("u")
public class UserDAOImpl extends  SuperDAO  implements UserDAO {

	public void save(User user) {
		
		this.getHibernateTemplate().save(user);

	}

}
