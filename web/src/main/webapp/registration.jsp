<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Редактирование товара</title>
</head>
<body>
<form action="/shop/registration" method="post">
    <h2>${message }</h2><br>
    <table border="1">
        <tr>
            <td>Ваше Имя</td>
            <td><input type="text" name="firstname"></td>
        </tr>
        <tr>
            <td>Ваша фамилия</td>
            <td>
                <input type="text" name="lastname">
            </td>
        </tr>
        <tr>
            <td>mail</td>
            <td>
                <input type="text" name="mail">
            </td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password"></td>
        </tr>
    </table>
    <input type="submit" name="Save" value="Зарегистрироваться">
</form>
<a href="/shop/">
    <button>Назад в Магазин</button>
</a>
</body>
</html>
