package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component("u")
public class UserDAOImpl implements UserDAO {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void save(User user) {
		
		//Hibernate
		//JDBC
		//XML
		//NetWork
		//throw new RuntimeException("exeption!");
		try {
			Connection conn = dataSource.getConnection();
			conn.createStatement().execute("INSERT INTO user VALUES (null, 'zhangsan')");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("user saved!");

	}

}
