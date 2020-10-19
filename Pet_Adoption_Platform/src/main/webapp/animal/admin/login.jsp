<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">
    <title>登录页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
<div class="bg"></div>

<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height:150px;"></div>
            <div class="media media-y margin-big-bottom"></div>
            <form action="${pageContext.request.contextPath}/login.action" method="post">
                <div class="panel loginbox" style="background-color:rgba(187,192,80,0.29) ">
                    <div class="text-center margin-big padding-big-top">
                        <h1>欢迎使用宠物领养管理系统</h1>
                    </div>
                    <div style="text-align: center;font-size: 16px;color: red">${msg}</div>
                    <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px ">
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="text" class="input input-big" name="adminName" id="name" placeholder="账号"/>
                                <span class="icon icon-user margin-small"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input input-big" name="adminPwd" id="password"
                                       placeholder="密码"/>
                                <span class="icon icon-key margin-small"></span>
                            </div>
                        </div>
                        <div class="form-group v_container">
                            <div class="field">
                                <input type="text" class="input input-big" id="code_input" name="code"
                                       placeholder="验证码"/>
                                <div id="v_container" style="width: 100px;height: 45px;" class="passcode"></div>
                            </div>
                        </div>
                        <div style="padding:30px;">
                            <input type="submit" id="button" class="button button-block bg-main text-big input-big"
                                   value="登录"><br/>
                            <a href="${pageContext.request.contextPath}/animal/index.jsp"
                               style="text-decoration: none;font-size: 16px;">返回首页</a>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script src="${pageContext.request.contextPath}/js/gVerify.js"></script>
<script>

    var verifyCode = new GVerify("v_container");
    document.getElementById("button").onclick = function () {

        /*获取inputi面的值*/
        var res = verifyCode.validate(document.getElementById("code_input").value);
        if (!res) {
            alert("验证码错误");
            return false;
        }
    }

</script>

</html>
