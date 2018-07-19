<%--
  Created by IntelliJ IDEA.
  User: Sirius
  Date: 2018/7/19
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="user!register.action" method="post">
    <h4>用户名：</h4><input name="user.account" type="text" /><br/>
    <h4>密码：</h4><input name="user.password" type="password" /><br/>
    <h4>${info}</h4><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
