<%--
  Created by IntelliJ IDEA.
  User: wx
  Date: 2019/6/24
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</head>
<body>
<h3>查询所有账户信息</h3>

</body>
</html>
