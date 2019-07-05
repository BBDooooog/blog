<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
</head>
<body>
<div style="margin: auto">
    <h1>登陆</h1>
    <form method="post" action="/login">
        用户名：<input type="text" name="username">
        密  码：<input type="password" name="password">
        <input type="checkbox" name="remember-me"/>自动登录
        <button type="submit">立即登陆</button>
    </form>
</div>
</body>
</html>