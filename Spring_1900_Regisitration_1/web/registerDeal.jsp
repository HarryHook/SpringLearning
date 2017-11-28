<%--
  Created by IntelliJ IDEA.
  User: Harry
  Date: 2017/11/28
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, java.sql.*" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "123");

    String sqlQuery = "select count(*) from user where username=?";
    PreparedStatement psQuery = conn.prepareStatement(sqlQuery);
    psQuery.setString(1, username);
    ResultSet rs = psQuery.executeQuery();
    rs.next();
    int count = rs.getInt(1);
    if(count > 0) {
        response.sendRedirect("registerFail.jsp");
        psQuery.close();
        conn.close();
        return;
    }

    String sql = "insert into user values(null, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, username);
    ps.setString(2, password);
    ps.executeUpdate();
    ps.close();
    conn.close();

    response.sendRedirect("registerSuccess.jsp");

%>
