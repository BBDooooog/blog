<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <div class="register">
        <form method="post" action="/register">
            <div><span>用户名</span><input type="text" name="username">${userVo.username!''}</div>
            <div><span>密码</span><input type="password" name="password">${userVo.password!''}</div>
            <div><span>确认密码</span><input type="password"name="confPassword">${userVo.confPassword!''}</div>
            <div><button type="submit">注册</button></div>
        </form>
    </div>
</div>
</body>
</html>