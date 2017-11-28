package com.bjsxt.registeration.service;

import com.bjsxt.registeration.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
管理实例，比如查询User是否存在
 */
public class UserManager {
    public boolean exists(User user) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "123");

        String sqlQuery = "select count(*) from user where username=?";
        PreparedStatement psQuery = conn.prepareStatement(sqlQuery);
        psQuery.setString(1, user.getUsername());
        ResultSet rs = psQuery.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        psQuery.close();
        conn.close();
        if (count > 0) {
            return true;
        }
        return false;
    }

    public void add(User user) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "123");

        String sql = "insert into user values(null, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
