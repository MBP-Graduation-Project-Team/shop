<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王攀
  Date: 2019/12/30 0030
  Time: 上午 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>支付成功</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/pay/css/buju.css"/>
</head>
<body>
<!-- 导航栏 -->
<div class="header">

    <!-- 左侧导航栏 -->
    <div class="left_header">
        <font size="+3" style="float:right">支付订单</font>
    </div>

    <!-- 右侧导航栏 -->
    <div class="right_header">
        <a href="#">用户</a>
        <a href="#">我的订单</a>
    </div>
</div>
<div class="zhongjian" >
    <h2><font color="#00FF00">支付成功</font></h2>
    <table align="center">
        <tr>
            <td><font style="float:right">订单号：</font></td>
            <td><font style="float:left">${order.orderNumber}</font></td>
        </tr>
        <tr>
            <td><font style="float:right">用户：</font></td>
            <td><font style="float:left">${order.userName}</font></td>
        </tr>
        <tr>
            <td><font style="float:right">商品信息：</font></td>
            <c:forEach items="${order.productInfos}" var="i">
                <td><font style="float:left">${i.productName}&nbsp;</font></td>
            </c:forEach>
        </tr>
        <tr>
            <td><font style="float:right">金额：</font></td>
            <td><font style="float:left">${order.actualAmount}元</font></td>
        </tr>
        <tr>
            <td><font style="float:right">地址：</font></td>
            <td><font style="float:left">${order.address}</font></td>
        </tr>
    </table><br><br>
    <button class="butten">再去看看其他商品</button>
</div>
<br>
<br>
<br>
<div class="wei">
    SHOP网站
</div>
</body>
</html>
