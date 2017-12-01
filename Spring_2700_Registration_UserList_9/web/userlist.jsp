<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/1 0001
  Time: 下午 3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:iterator value="users">
        <s:property value="username"/>
    </s:iterator>
    <s:debug></s:debug>
</body>
</html>
