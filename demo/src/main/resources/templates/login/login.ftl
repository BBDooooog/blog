<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
</head>
<link rel="stylesheet" href="/css/base/base.css">
<script type="application/javascript">
    function doRregister(){
        window.location.href = "/doRregister";
    }
</script>
<body class="index-bg">
<#--<#include "/base/header.ftl">-->
<div class="body">
    <div class="index login">
        <div class="index-body">
            <form method="post" action="/login">
                <h1>请登录。</h1>
                <div><input type="text" name="username"  placeholder="用户名/手机号"></div>
                <div><input type="password" name="password"  placeholder="密码"></div>
                <#--<input type="checkbox" name="remember-me"/>自动登录-->
                <div class="btn"><button type="submit">立即登陆</button></div>
                <div class="btn"><button type="button" onclick="doRregister()">注册</button></div>
            </form>
        </div>

    </div>
</div>
<#include "/base/footer.ftl">
</body>
</html>