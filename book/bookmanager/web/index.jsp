<%--
  Created by IntelliJ IDEA.
  User: Sirius
  Date: 2018/7/17
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>

<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <%--<form action="testA.action" method="post">
      <input type="text" name="testReq.id" />
      <input type="submit" value="进入测试" />
  </form>--%>
    <form action="user!login.action" method="post">
        <h4>用户名：</h4><input name="user.account" type="text" /><br/>
        <h4>密码：</h4><input name="user.password" type="password" /><br/>
        <h4>${info}</h4><br/>
        <input type="submit" value="登陆"><a href="register.jsp">注册</a>
    </form>

  </body>
</html>
