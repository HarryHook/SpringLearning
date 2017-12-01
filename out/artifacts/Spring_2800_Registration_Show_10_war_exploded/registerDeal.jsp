<%--
  Created by IntelliJ IDEA.
  User: Harry
  Date: 2017/11/28
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, java.sql.*" %>
<%@ page import="com.bjsxt.registration.model.*" %>
<%@ page import="com.bjsxt.registration.service.*" %>
<%@ page import="com.bjsxt.registration.service.UserManager" %>
<%@ page import="com.bjsxt.registration.service.impl.UserManagerImpl" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");

    User user = new User();
    user.setUsername(username);
    user.setPassword(password);

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "123");

    UserManager userManager = new UserManagerImpl();
    boolean exist = userManager.exists(user);
    if(exist) {
        response.sendRedirect("registerFail.jsp");
        return;
    }

    userManager.add(user);
    response.sendRedirect("registerSuccess.jsp");

%>
