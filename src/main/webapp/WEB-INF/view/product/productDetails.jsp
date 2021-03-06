<%--
  Created by IntelliJ IDEA.
  User: moon
  Date: 2019/12/30
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>手机详情</title>
    <!-- 引入css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/product/css/style.css"/>
    <script src="${pageContext.request.contextPath }/resources/product/js/jquery.min.js"></script>

</head>
<style>

</style>
<body>

<!-- 商城头部 -->
<div id="head">

    <!-- 导航栏 -->
    <div class="header">

        <!-- 左侧导航栏 -->
        <div class="left_header">
            <a href="index.html">首页</a>
            <a href="#">更多商品</a>
            <a href="#">用户中心</a>
        </div>

        <!-- 右侧导航栏 -->
        <div class="right_header">
            <a href="#">登录</a>
            <a href="#">注册</a>
            <a href="#">我的订单</a>
        </div>
    </div>

    <!-- 商城 -->
    <div class="gmall">
        <div class="img" style="margin-top: 5px; margin-left: 1px;">
            <a href="index.html">ZLJ.COM</a>
        </div>

        <!-- 搜索按钮 -->
        <div class="container">
            <form action="" class="parent">
                <input type="text" class="search" placeholder="搜索">
                <input type="button" name="" id="" class="btn"
                       style="background-image: url(${pageContext.request.contextPath }/resources/product/img/log2.1.png);">
            </form>
        </div>
    </div>

</div>

<!-- 索引 -->
<!-- 空 -->
<div class="kong">
    <div class="action">
				<span>
					<a href="index.html">首页</a>
				</span>
        >
        <span>
					<a href="product_list.html">手机</a>
				</span>
        >
        <span>
					<a href="product_details.html">小米cc9</a>
				</span>
    </div>
</div>


<!-- 商品详情 -->
<div id="product_details">

    <!-- 商品图片  -->
    <div class="product_img">
        <img src="${pageContext.request.contextPath }/resources/product/img/phone/小米cc9_3.jpg"/>
    </div>

    <!-- 商品信息 -->
    <div class="product_msg">

        <!-- 手机名 -->
        <div class="phone_text">
					<span>
						<h3>
							荣耀V30 PRO 双模5G 麒麟990 5G SOC芯片 突破性相机矩阵 双超级快充 8GB+128GB 冰岛幻境
						</h3>
					</span>
        </div>

        <!-- 基础信息 -->
        <div class="phone_text1">
					<span>
						<span class="sty">价 格:</span>
						<span class="price">¥3899.00 </span>
					</span>
            <br/>
            <span>
						<span class="sty">活 动:</span>
						<span>已满48元已免运费 由华为商城负责发货，并提供售后服务</span>
					</span>
            <br/>

            <div style="width: 300px;height: 30px;">
						<span>
							<span class="sty">颜 色:</span>
							<div class="color">
								<div><a href="#">黑色</a></div>
								<div><a href="#">黑色</a></div>
								<div><a href="#">黑色</a></div>
								<div><a href="#">黑色</a></div>
							</div>
						</span>
            </div>

            <div style="width: 300px;height: 30px;">
						<span>
							<span class="sty">规 格:</span>
							<div class="color1">
								<div><a href="#">6+128G</a></div>
								<div><a href="#">8+256G</a></div>
                                <!-- <div><a href="#">12+512G</a></div> -->
							</div>
						</span>
            </div>

            <!-- 商品简介 -->
            <span>
						<span class="sty">简 介:</span>
						<span>
							4000万像素（f/1.6光圈 AF OIS）+1200万像素（f/2.2光圈 AF）+800万像素（f/2.4光圈 AF OIS），
							支持自动对焦（激光对焦/相位对焦/反差对焦）。
						</span>
					</span>
            <br/>

            <!-- 上架时间 -->
            <span>
						<span class="sty">上架时间:</span>
						<span>
							2019年11月
						</span>
					</span>

            <!-- 数量 -->
            <div class="button_sty">
                <span class="sty">数 量:</span>
                <input type="button" id="button" class="button" value="-" onclick="reductionOf(this)"/>
                <input type="text" class="text" value="1" onblur="checkNumber(this)"/>
                <input type="button" class="button" value="+" onclick="addEnd(this)"/>
            </div>


            <!--商品收藏-->
            <div class="collect">
                <a href="#">
                    ๑乛◡乛๑收藏商品
                </a>
            </div>

        </div>

        <!-- 加入购物车 -->
        <div class="shopping">
            <div class="rec_pro">
						<span>
							<span class="sty">推荐商品:</span>
							<span>
								<div><a href="#">华为P10</a></div>
								<div><a href="#">苹果7</a></div>
								<div><a href="#">小米6</a></div>
								<div><a href="#">锤子T1</a></div>
							</span>
						</span>
            </div>
            <!-- 购买 -->
            <div class="shop">
                <ul>
                    <!-- 加入购物车 -->
                    <li>
                        <a href="#">加入购物车</a>
                    </li>
                    <!-- 立即购买 -->
                    <li>
                        <a href="#">立即购买</a>
                    </li>
                </ul>
            </div>

        </div>

    </div>

</div>

<!-- 详情信息 -->
<!-- 空 -->
<div class="kong">
</div>

<!-- 详情 -->
<div class="text">
    <div>
				<span>
					<a href="#product_imgs">商品详情</a>

					<a href="#product_comment">用户评论</a>
				</span>
    </div>
</div>

<!-- 图片信息 -->
<div id="product_imgs" class="product_imgs">


</div>

<!-- 评论 -->
<div id="product_comment">

    <div style="margin-left: 40px;color: #6D6D6D;">
				<span style="font-size: 16px;">
					<h1>
						用户评论：
					</h1>
				</span>
    </div>


    <!-- 用户评论模块 -->
    <div class="user_comment">
        <!-- 用户信息 -->
        <div class="user_msg">
            <!-- 头像 -->
            <div class="user_img">
                <img src="${pageContext.request.contextPath }/resources/product/img/header/head.jpg"/>
            </div>
            <!-- 用户名 -->
            <div class="user_name">
						<span>
							张三
						</span>
            </div>
        </div>
        <!-- 评价 -->
        <div class="comment">
            <!-- 时间 -->
            <div class="comment_data">
						<span>
							2019-12-22 14:52:344
						</span>
            </div>
            <!-- 商品的评价 -->
            <div class="comment_text">
						<span>
							挺好！挺快！挺漂亮！很满意！十分贴合，手感舒适，防滑防颠，操控容易。
						</span>
            </div>
            <!-- 购买商品的信息 -->
            <div class="comment_pro">
						<span>
							青山黛,5G全网通,8GB+128GB
						</span>
            </div>
        </div>
    </div>


    <div class="user_comment">
        <!-- 用户信息 -->
        <div class="user_msg">
            <!-- 头像 -->
            <div class="user_img">
                <img src="img/header/head.jpg"/>
            </div>
            <!-- 用户名 -->
            <div class="user_name">
						<span>
							张三
						</span>
            </div>
        </div>
        <!-- 评价 -->
        <div class="comment">
            <!-- 时间 -->
            <div class="comment_data">
						<span>
							2019-12-22 14:52:344
						</span>
            </div>
            <!-- 商品的评价 -->
            <div class="comment_text">
						<span>
							挺好！挺快！挺漂亮！很满意！十分贴合，手感舒适，防滑防颠，操控容易。
						</span>
            </div>
            <!-- 购买商品的信息 -->
            <div class="comment_pro">
						<span>
							青山黛,5G全网通,8GB+128GB
						</span>
            </div>
        </div>
    </div>

    <!-- 用户评论模块 -->
    <div class="user_comment">
        <!-- 用户信息 -->
        <div class="user_msg">
            <!-- 头像 -->
            <div class="user_img">
                <img src="img/header/head.jpg"/>
            </div>
            <!-- 用户名 -->
            <div class="user_name">
						<span>
							张三
						</span>
            </div>
        </div>
        <!-- 评价 -->
        <div class="comment">
            <!-- 时间 -->
            <div class="comment_data">
						<span>
							2019-12-22 14:52:344
						</span>
            </div>
            <!-- 商品的评价 -->
            <div class="comment_text">
						<span>
							挺好！挺快！挺漂亮！很满意！十分贴合，手感舒适，防滑防颠，操控容易。
						</span>
            </div>
            <!-- 购买商品的信息 -->
            <div class="comment_pro">
						<span>
							青山黛,5G全网通,8GB+128GB
						</span>
            </div>
        </div>
    </div>

    <!-- 用户评论模块 -->
    <div class="user_comment">
        <!-- 用户信息 -->
        <div class="user_msg">
            <!-- 头像 -->
            <div class="user_img">
                <img src="img/header/head.jpg"/>
            </div>
            <!-- 用户名 -->
            <div class="user_name">
						<span>
							张三
						</span>
            </div>
        </div>
        <!-- 评价 -->
        <div class="comment">
            <!-- 时间 -->
            <div class="comment_data">
						<span>
							2019-12-22 14:52:344
						</span>
            </div>
            <!-- 商品的评价 -->
            <div class="comment_text">
						<span>
							挺好！挺快！挺漂亮！很满意！十分贴合，手感舒适，防滑防颠，操控容易。
						</span>
            </div>
            <!-- 购买商品的信息 -->
            <div class="comment_pro">
						<span>
							青山黛,5G全网通,8GB+128GB
						</span>
            </div>
        </div>
    </div>

    <div class="user_comment">
        <!-- 用户信息 -->
        <div class="user_msg">
            <!-- 头像 -->
            <div class="user_img">
                <img src="img/header/head.jpg"/>
            </div>
            <!-- 用户名 -->
            <div class="user_name">
						<span>
							张三
						</span>
            </div>
        </div>
        <!-- 评价 -->
        <div class="comment">
            <!-- 时间 -->
            <div class="comment_data">
						<span>
							2019-12-22 14:52:344
						</span>
            </div>
            <!-- 商品的评价 -->
            <div class="comment_text">
						<span>
							挺好！挺快！挺漂亮！很满意！十分贴合，手感舒适，防滑防颠，操控容易。
						</span>
            </div>
            <!-- 购买商品的信息 -->
            <div class="comment_pro">
						<span>
							青山黛,5G全网通,8GB+128GB
						</span>
            </div>
        </div>
    </div>

</div>

<!-- 分页 -->
<div class="kong">
    <div class="page" style="margin-left: 20px;">
        <div class="yahoo">
            <span class="disabled">&lt; </span>
            <span class="current">1</span>
            <a href="#?page=2">2</a>
            <a href="#?page=3">3</a>
            <a href="#?page=4">4</a>
            <a href="#?page=5">5</a>
            <a href="#?page=6">6</a>
            <a href="#?page=7">7</a>
            <a href="#?page=2">&gt; </a>
        </div>
        <div class="count" style="margin-top: 10px;">
					<span>
						共28条记录，3页
					</span>
        </div>
    </div>

    <!-- 商城底部 -->
    <div id="footer" style="margin-left: 20px;width: 100%;">
        <!-- 商城信息 -->
        <div class="message">
            <a href="#">商品大全</a>
            <a href="#">用户中心</a>
            <a href="#">订单中心</a>
            <a href="#">我的商家</a>
            <a href="#">建议和意见</a>
            <div>
                <p class="b_url">www.zlj6.com 豫ICP证00000号 豫ICP备0000000000号 豫公网安备0000000000000号 豫网文[2019]0059-0009号</p>
            </div>
        </div>
    </div>

</body>
</html>


<script>
    /* js入口函数 */
    $(function () {
        /* 数量 */
        $(".color div").click(function () {
            /* 得到原css样式 */
            $(".color div").css("border", "1px #8FBC8F solid");
            /* 更改当前this */
            $(this).css("border", "1px red solid");
            $(this).css("cursor", "pointer");
        });

        /* 规格 */
        $(".color1 div").click(function () {
            /* 得到原css样式 */
            $(".color1 div").css("border", "1px #8FBC8F solid");
            /* 更改当前this */
            $(this).css("border", "1px red solid");
            $(this).css("cursor", "pointer");
        })
    })

    /* 减数 */
    function reductionOf(obj) {
        console.log($(obj).next().val());
        //减前判断
        if ($(obj).next().val() == '') {
            $(obj).next().val(1);
        }

        if ($(obj).next().val() == 1) {
            $("#button").css("background-color", "#CCCCCC")
            $("#button").attr('disabled', 'disabled')
        } else {
            $(obj).next().val(parseInt($(obj).next().val()) - 1);//数值减
            $(obj).next().val($(obj).next().val());//赋值给框
        }
    };

    /* 加数 */
    function addEnd(obj) {

        console.log($(obj).prev().val());
        //加前判断
        if ($(obj).prev().val() == '') {
            $(obj).prev().val(1);
        }
        if ($(obj).prev().val() == 1) {
            $("#button").css("background-color", "#DFDFDF")
            $("#button").removeAttr('disabled');
        }

        $(obj).prev().val(parseInt($(obj).prev().val()) + 1);//数值加
        $(obj).prev().val($(obj).prev().val());//赋值给框
    }

    //校验数字格式（只能输入正整数）
    function checkNumber(obj) {
        var reg = /^[1-9]\d*$/;
        if (!reg.test($(obj).val()) || $(obj).val() == '') {
            $(obj).val(1);
        }
    }

</script>
