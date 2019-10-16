<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
</head>
<style>
    .login{
        position: absolute;
        top: 0;
        left: 0;
        bottom: 0;
        right: 0;
        margin: auto;
        width: 400px;
        height: 300px;
    }
    .login div{
        margin-top: 25px;
    }
    .login div input{
        width: 300px;
        height: 40px;
        border-radius: 5px;
        border: 1px solid #ccc;
        outline: none;
    }
    .btn button{
        width: 300px;
        height: 40px;
        outline: none;
        border-radius: 5px;
        border: none;

        background: blue;
        color: white;
    }
</style>
<body>
<div style="width: 100%;">
    <div class="login">
        <h1>请登录。</h1>
        <form method="post" action="/login">
            <div><input type="text" name="username"  placeholder="用户名/手机号"></div>
            <div><input type="password" name="password"  placeholder="密码"></div>
            <#--<input type="checkbox" name="remember-me"/>自动登录-->
            <div class="btn"><button type="submit">立即登陆</button></div>
        </form>
    </div>
</div>
</body>
</html>