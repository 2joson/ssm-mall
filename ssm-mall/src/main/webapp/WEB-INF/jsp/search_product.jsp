<%--
  Created by IntelliJ IDEA.
  User: m2068
  Date: 2023/6/27
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/index_work.css">
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>名称</td>
        <td>原价</td>
        <td>现价</td>
        <td>库存</td>
        <td>评论数</td>
        <td>销售量</td>
    </tr>
    <tr>
        <td> ${product.id}</td>
        <td> ${product.name}</td>
        <td> ${product.originalPrice}</td>
        <td> ${product.nowPrice}</td>
        <td> ${product.stock}</td>
        <td> ${product.commentCount}</td>
        <td> ${product.saleCount}</td>
        <td><a href="addProduct/${product.name}">添加进订单</a></td>
    </tr>


</table>
</body>
</html>
