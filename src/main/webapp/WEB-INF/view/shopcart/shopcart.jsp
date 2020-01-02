<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/30 0030
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/resources/shopcart/js/jquery-2.2.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/resources/shopcart/js/ShoppingCartJS.js"></script>
<style type="text/css">
    body{
        margin:0 auto;
        width: 70%;
    }
    img{
        width: 125px;
        height: 125px;
    }
    .inputs{
        width:20px;
    }
    #main{
        padding:0px;
        margin:0px;
        position:relative;
    }
    #mytable{
        width:1000px;
    }
    #mytable td{
        width:200px;
    }
    table{
        font-size: 10px;
        border-collapse: collapse;
    }
    td{
        border: 1px solid #999999;
        border-right: 0px;
        border-left: 0px;
    }
</style>
</head>
<body>
<div>
    <div id="main">
        <table id="mytable">
            <tr>
                <th align="left">
                    <!--<input type="checkbox" name="all" id="selectAll" >全选-->
                    <button id="checkAll" onclick="checkAll()">全选</button>
                    <button id="checkNotAll" onclick="checkNotAll()" style="display:none">全不选</button>
                </th>
                <th colspan="3">商品</th>
                <th>单价</th>
                <th>购买个数</th>
                <th>费用</th>
                <th>删除</th>
            </tr>
            <tr>
                <!--            <td><input type="checkbox" name="ck1" id="ck1"></td>-->
                <td>
                    <input onclick="isCheckAll()" type="checkbox" name="che" class="checkcon" id="che1" value="1" />
                </td>
                <td align="center" colspan="3">
                    <img src="${pageContext.request.contextPath }/resources/shopcart/img/924b3ecca458e8c0.jpg" />
                    <br />
                    <span >商品名称1</span>
                </td>

                <td align="center">123</td>
                <td align="center">
                    <button class="cut">-</button>
                    <!--<img src="img/taobao_minus.jpg" class="cut">-->
                    <input type="text" size="4" value="1" style="width:20px" name="inputCount" oninput="value=value.replace(/[^\d]/g,'')"/>
                    <!--<img src="img/taobao_adding.jpg" class="add">-->
                    <button class="add">+</button>
                </td>
                <td align="center"></td>
                <td align="center"><input type="button" value="删除" class="delete" name="deleteGoods"></td>
            </tr>
            <tr>
                <!--<td><input type="checkbox" name="ck1" id="ck2"></td>-->
                <td><input onclick="isCheckAll()" type="checkbox" name="che" class="checkcon" id="che2" value="2" /></td>
                <td align="center" colspan="3">
                    <img src="${pageContext.request.contextPath }/resources/shopcart/img/924b3ecca458e8c0.jpg" />					<br />
                    <span >商品名称1</span>
                </td>
                <td align="center">432</td>
                <td align="center">
                    <button class="cut">-</button>
                    <!--<img src="img/taobao_minus.jpg" class="cut">-->
                    <input type="text" size="4" value="1" style="width:20px" name="inputCount" oninput="value=value.replace(/[^\d]/g,'')"/>
                    <!--<img src="img/taobao_adding.jpg" class="add">-->
                    <button class="add">+</button>
                </td>
                <td align="center"></td>
                <td align="center"><input type="button" value="删除" class="delete" name="deleteGoods"></td>
            </tr>
            <tr>
                <!--<td><input type="checkbox" name="ck1" id="ck3"></td>-->
                <td><input onclick="isCheckAll()" type="checkbox" name="che" class="checkcon" id="che3" value="3" /></td>
                <td align="center" colspan="3">
                    <img src="${pageContext.request.contextPath }/resources/shopcart/img/924b3ecca458e8c0.jpg" />					<br />
                    <span >商品名称1</span>
                </td>
                <td align="center">789</td>
                <td align="center">
                    <button class="cut">-</button>
                    <!--<img src="img/taobao_minus.jpg" class="cut">-->
                    <input type="text" size="4" value="1" style="width:20px" name="inputCount" oninput="value=value.replace(/[^\d]/g,'')"/>
                    <!--<img src="img/taobao_adding.jpg" class="add">-->
                    <button class="add">+</button>
                </td>
                <td align="center"></td>
                <td align="center"><input type="button" value="删除" class="delete" name="deleteGoods"></td>
            </tr>
            <tr>
                <!-- <td><input type="checkbox" name="ck1" id="ck4"></td>-->
                <td><input onclick="isCheckAll()" type="checkbox" name="che" class="checkcon" id="che4" value="4" /></td>
                <td align="center" colspan="3">
                    <img src="${pageContext.request.contextPath }/resources/shopcart/img/924b3ecca458e8c0.jpg" />					<br />
                    <span >商品名称1</span>
                </td>
                <td align="center">153</td>
                <td align="center">
                    <button class="cut">-</button>
                    <!--<img src="img/taobao_minus.jpg" class="cut">-->
                    <input type="text" size="4" value="1" style="width:20px" name="inputCount" oninput="value=value.replace(/[^\d]/g,'')"/>
                    <!--<img src="img/taobao_adding.jpg" class="add">-->
                    <button class="add">+</button>
                </td>

                <td align="center"></td>
                <td align="center"><input type="button" value="删除" class="delete" name="deleteGoods"></td>
            </tr>
            <tr><td><button id="deleteSelete">删除选中商品</button></td><td colspan="7" align="right">总费用：￥<span id="sum"></span></td></tr>
            <!--<tr><td colspan="8"><input type="button" value="删除选中的项" id="deleteSelete"> </td></tr>-->
            <tr>
                <td colspan="8">
                    <div align="right"><button id="settlement" align="rigth" onclick="settlement()">结算</button></div></td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>
