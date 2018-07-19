<%--
  Created by IntelliJ IDEA.
  User: Sirius
  Date: 2018/7/17
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="testA.action" method="post">
        <input type="text" name="testReq.id" value="${testReq.id}"/>
        <input type="submit" value="再次请求" />
    </form>

</body>
</html>
