<%@ page language="java" contentType="text/html; charset=cp1251"
         pageEncoding="cp1251" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Login page</title>
</head>
<body>


<legend>Login</legend>
${message }<br>

<form method="post" action="account" class="form-horizontal">
    <div class="control-group">
        <label class="control-label">Email</label>

        <div class="controls" >
            <input type="text" name="mail" placeholder="Email">
        </div>
    </div>
    <div class="control-group">
        <label class="control-label">Password</label>

        <div class="controls">
            <input type="password" name="password" id="inputPassword" placeholder="Password">
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button type="submit" class="btn btn-info">Войти</button>
            <a href="/shop/" class="btn btn-info">Назад в Магазин</a>
        </div>
    </div>
</form>

</body>
</html>
