<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">
    <title>登录页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login.css">
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
                        <button id="button" class="button button-block bg-main text-big input-big" >登录</button><br/>
                        <a href="${pageContext.request.contextPath}/animal/user/index.jsp"
                           style="text-decoration: none;font-size: 14px;text-align: left">返回首页</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script src="${pageContext.request.contextPath}/static/js/gVerify.js"></script>
<script src="${pageContext.request.contextPath}/static/JQuery/jquery-3.4.1.js "></script>
<script>

    var verifyCode = new GVerify("v_container");

    $("#button").click(function () {
        // var res = verifyCode.validate(document.getElementById("code_input").value);

        var adminName = $("#name").val();
        var adminPwd = $("#password").val();
        var code = $("#code_input").val();

        if (adminName == "") {
            // $("#name").val("请输入账号!");
            $("#name").attr("placeholder","请输入账号!");
            $("#name").css('background-color', '#FFE14A');
        }
        if (adminPwd == "") {
            // $("#password").val("请输入密码!");
            $("#password").attr("placeholder","请输入密码!");
            $("#password").css('background-color', '#FFE14A');
        }
        if (!verifyCode.validate(code)) {
            // $("#code_input").val("请正确输入验证码！");
            $("#code_input").attr("placeholder","请正确输入验证码!");
            $("#code_input").css('background-color', '#ffe14a');
            return false;
        }
        /* if (!res) {
             alert("验证码错误");
             return false;
         }*/
    })

</script>

</html>
