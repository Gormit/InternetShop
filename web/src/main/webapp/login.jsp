<%@ page language="java" contentType="text/html; charset=cp1251"
         pageEncoding="cp1251"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="login.css">
  <title>Insert title here</title>
</head>
<body>

<fieldset>
  <legend>Login</legend>
  ${message }<br>
  <form method="post" action="account">
    <table cellpadding="2" cellspacing="2">
      <tr>
        <td>Mail</td>
        <td><input type="text" name = "mail" value="uzver@gmail.com"></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><input type="password" name = "password" value="1234"></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><input type="submit" value = "Âîéòè"> <input type="button" onclick="history.back();" value="Íàçàä"/></td>
      </tr>
    </table>
  </form>
</fieldset>

</body>
</html>
