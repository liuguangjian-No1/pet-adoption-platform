<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        <sitemesh:write property='title'/>
    </title>
    <sitemesh:write property='head'/>
    <!-- 引入css样式文件 -->
    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/js/houtai/css/metisMenu.min.css" rel="stylesheet">
    <!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath}/js/houtai/css/dataTables.bootstrap.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/js/houtai/css/sb-admin-2.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/js/houtai/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/js/houtai/css/boot-crm.css" rel="stylesheet" type="text/css">
    <style>
        .panel-heading {
            background-color: #337ab7;
            border-color: #2e6da4;
            font-size: 14px;
            padding-left: 20px;
            height: 36px;
            line-height: 36px;
            color: white;
            position: relative;
            cursor: pointer;
        }

        /*转成手形图标*/
        .panel-heading span {
            position: absolute;
            right: 10px;
            top: 12px;
        }
    </style>
</head>
<body>
<!-- 导航栏部分 -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <a class="navbar-brand" href="" style="font-size: 24px">流浪猫狗管理系统</a>
    </div>
    <!-- 导航栏右侧图标部分 -->
    <!-- 导航栏右侧图标部分 -->
    <ul class="nav navbar-top-links navbar-right">
        <!-- 消息通知 end -->
        <!-- 用户信息和系统设置 start -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown"
               href="${pageContext.request.contextPath}/admin/developing">
                <i class="fa fa-user fa-fw"></i>
                <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user ">
                <li>
                    <input type="hidden" id="currentAdminId" value="${admin.id}">
                </li>
                <li><a href="${pageContext.request.contextPath}/admin/developing"><i class="fa fa-user fa-fw"></i>
                    管理员：${admin.adminName}</a>
                </li>
                <li><a href="${pageContext.request.contextPath}/admin/developing"><i class="fa fa-gear fa-fw"></i> 系统设置</a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="${pageContext.request.contextPath}/admin/logout.action">
                        <i class="fa fa-sign-out fa-fw"></i>退出登录
                    </a>
                </li>
            </ul>
        </li>
        <!-- 用户信息和系统设置结束 -->
    </ul> <!-- 左侧显示列表部分 start-->
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <!-- 教学管理  折叠的分组列表 -->
            <div class="panel-heading" id="collapseListGroupHeading3" data-toggle="collapse"
                 data-target="#collapseListGroup3" role="tab">
                <h4 class="panel-title">
                    后台管理 <span class="fa fa-chevron-up right"></span>
                </h4>
            </div>
            <div id="collapseListGroup3" class="panel-collapse collapse in" role="tabpanel"
                 aria-labelledby="collapseListGroupHeading3">
                <ul class="list-group">
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/users.jsp">
                            <i class="fa fa-flash fa-fw"></i> 用户信息
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/admin.jsp">
                            <i class="fa fa-flash fa-fw"></i> 管理员信息
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/pet.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 宠物管理
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/adopt.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 领养管理
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/comment.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 评论管理
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/blog.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 团队活动管理
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/apply.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 志愿者的申请
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/agree.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 同意领养列表
                        </a>
                    </li>
                    <li class="list-group-item my_font">
                        <a href="${pageContext.request.contextPath}/animal/admin/disAgree.jsp">
                            <i class="fa fa-sitemap fa-fw"></i> 不同意领养列表
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div><!-- 左侧显示列表部分 end-->
</nav>

</body>
</html>
