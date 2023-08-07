<%--
  Created by IntelliJ IDEA.
  User: m2068
  Date: 2023/6/23
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tr>
</tr>
<table align="center" border="1">
    <tr>
        <th>
            用户名
        </th>
        <th>
            密码
        </th>
        <th>
            组别
        </th>
    </tr>
    <c:forEach items="${allUser}" var="user" varStatus="s">
        <c:if test="${s.count%2==0}">
            <tr bgcolor="">
                <td>
                        ${user.name}
                </td>
                <td>
                        ${user.password}
                </td>
                <td>
                        ${user.group_}
                </td>
            </tr>
        </c:if>
        <c:if test="${s.count%2!=0}">
            <tr bgcolor="">
                <td>
                        ${user.name}
                </td>
                <td>
                        ${user.password}
                </td>
                <td>
                        ${user.group_}
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
<%--                <a href="/deleteUser">删除</a>--%>
<%--                <a href="/updateUser">修改</a>--%>
                <a href="updateUser/${user.name}" title="编辑">编辑</a></td>
            </td>
            <td>
            <a href="deleteUser/${user.id}" title="删除">删除</a></td>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
