
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/business/css/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/business/css/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/business/css/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/business/css/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/business/css/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script><![endif]-->
    <!--/meta 作为公共模版分离出去-->

    <title>活动列表 - 活动管理 - 找靓机后台管理系统 v3.0</title>
</head>
<body>
<!--_header 作为公共模版分离出去-->
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">找靓机后台管理系统 </a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">找靓机</a> <span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.0</span> <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>超级管理员</li>
                    <li class="dropDown dropDown_hover"> <a href="#" class="dropDown_A">admin <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
                            <li><a href="#">切换账户</a></li>
                            <li><a href="#">退出</a></li>
                        </ul>
                    </li>
                    <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<!--/_header 作为公共模版分离出去-->

<!--_menu 作为公共模版分离出去-->
<aside class="Hui-aside">

    <div class="menu_dropdown bk_2">
        <dl id="menu-product">
            <dt><i class="Hui-iconfont">&#xe620;</i> 商品管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="Brand-list.html" title="品牌管理">品牌管理</a></li>
                    <li><a href="format-list.html" title="规格管理">规格管理</a></li>
                    <li><a href="commodity-list.html" title="商品管理">商品管理</a></li>
                    <li><a href="model-list.html" title="型号管理">型号管理</a></li>
                    <li><a href="reserve-list.html" title="库存管理">库存管理</a></li>
                    <li><a href="activity-list.html" title="活动管理">活动管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-comments">
            <dt><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="comment-list.html" title="评论列表">评论列表</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-tongji">
            <dt><i class="Hui-iconfont">&#xe61a;</i> 系统统计<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="charts-1.html" title="折线图">折线图</a></li>
                    <li><a href="charts-2.html" title="时间轴折线图">时间轴折线图</a></li>
                    <li><a href="charts-3.html" title="区域图">区域图</a></li>
                    <li><a href="charts-4.html" title="柱状图">柱状图</a></li>
                    <li><a href="charts-5.html" title="饼状图">饼状图</a></li>
                    <li><a href="charts-6.html" title="3D柱状图">3D柱状图</a></li>
                    <li><a href="charts-7.html" title="3D饼状图">3D饼状图</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<!--/_menu 作为公共模版分离出去-->

<section class="Hui-article-box">
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 品牌管理 <span class="c-gray en">&gt;</span> 品牌列表<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <div class="text-c">
                <input type="text" class="input-text" style="width:250px" placeholder="品牌名称" id="" name="">
                <button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 品牌</button>
            </div>
            <div class="cl pd-5 bg-1 bk-gray mt-20"><a href="javascript:;" onclick="member_add('添加活动','activity-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加活动</a></span> <span class="r">共有数据：<strong>60</strong> 条</span> </div>
            <div class="mt-20">
                <table class="table table-border table-bordered table-hover table-bg table-sort">
                    <thead>
                    <tr class="text-c">
                        <th width="25"><input type="checkbox" name="" value=""></th>
                        <th width="80">ID</th>
                        <th width="100">品牌名</th>
                        <th width="70">开始时间</th>
                        <th width="70">结束时间</th>
                        <th width="70">状态</th>
                        <th width="100">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="text-c">
                        <td><input type="checkbox" value="1" name=""></td>
                        <td>1</td>
                        <td><u style="cursor:pointer" class="text-primary" onclick="member_show('小米9','member-show.html','10001','360','400')">小米9</u></td>
                        <td>2019-6-11 11:11:42</td>
                        <td>2020-1-11 11:11:42</td>
                        <td class="td-status"><span class="label label-success radius">进行中</span></td>
                        <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="结束"><i class="Hui-iconfont">&#xe631;</i></a>  <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </article>
    </div>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/H-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/H-ui.admin.page.js"></script>

!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/business/js/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    // $(function(){
    //     $('.table-sort').dataTable({
    //         "aaSorting": [[ 1, "desc" ]],//默认第几个排序
    //         "bStateSave": true,//状态保存
    //         "aoColumnDefs": [
    //             //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
    //             {"orderable":false,"aTargets":[0,8,9]},// 制定列不参与排序
    //             {"sSearch":false}
    //         ]
    //
    //     });
    //     // $('.table-sort tbody').on( 'click', 'tr', function () {
    //     //     if ( $(this).hasClass('selected') ) {
    //     //         $(this).removeClass('selected');
    //     //     }
    //     //     else {
    //     //         table.$('tr.selected').removeClass('selected');
    //     //         $(this).addClass('selected');
    //     //     }
    //     // });
    // });    /*用户-添加*/
    function member_add(title,url,w,h){
        layer_show(title,url,w,h);
    }
    /*用户-查看*/
    function member_show(title,url,id,w,h){
        layer_show(title,url,w,h);
    }
    /*用户-停用*/
    function member_stop(obj,id){
        layer.confirm('确认要结束此活动吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">结束</span>');
            $(obj).remove();
            layer.msg('结束?!',{icon: 5,time:1000});
        });
    }

    /*用户-启用*/
    function member_start(obj,id){
        layer.confirm('确认要开始活动吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">进行中</span>');
            $(obj).remove();
            layer.msg('已开始!',{icon: 6,time:1000});
        });
    }



    /*用户-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            $(obj).parents("tr").remove();
            layer.msg('已删除!',{icon:1,time:1000});
        });
    }
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>