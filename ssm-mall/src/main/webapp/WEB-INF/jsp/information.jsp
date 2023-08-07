<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 86177
  Date: 2021/12/16
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
    <form action="<%=request.getContextPath()%>/save" method="post">
        <table align="center">
            <tr><td>序号:</td><td><input type="text" name="id" value="${user.id}"></td></tr>
            <tr><td>姓名:</td><td><input type="text" name="name" value="${user.name}"></td></tr>
            <tr><td>密码:</td><td><input type="text" name="password" value="${user.password}"></td></tr>
            <tr><td>组别:</td><td><input type="text" name="group_" value="${user.group_}"></td></tr>
            <tr><td><input type="submit" value="提交"></td><td><input type="reset" value="清空"></td></tr>
            <tr><td colspan="2">${errorMsg}</td></tr>
        </table>
    </form>
</head>
<body>

</body>
</html>
