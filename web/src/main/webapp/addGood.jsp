<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Добавление товара</title>
</head>
<body>
<form action="/shop/controller?param=saveGood" method="post">
    <table border="1">
        <tr>
            <td>Название</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Категория</td>
            <td>
                <select name="category">
                    <option value="1">Аудио-Видео</option>
                    <option value="2">Телефония</option>
                    <option value="3">Компьютеры</option>
                    <option value="4">Игровые консоли</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Производитель</td>
            <td>
                <select name="manufacturer">
                    <option value="1">LG</option>
                    <option value="2">SAMSUNG</option>
                    <option value="3">SONY</option>
                    <option value="4">Panasonic</option>
                    <option value="5">Apple</option>
                    <option value="6">Nokia</option>
                    <option value="7">Asus</option>
                    <option value="8">DELL</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Сколько погрузить на склад</td>
            <td><input type="text" name="count">${requestScope.invalidCount}</td>
        </tr>
        <tr>
            <td>Цена</td>
            <td><input type="text" name="price">${requestScope.invalidCount}</td>
        </tr>
        <tr>
            <td>Описание</td>
            <td><textarea name="description" rows="5" cols="70"></textarea></td>
        </tr>
    </table>
    <input type="submit" name="Добавить" value="Save">
</form>
<a href="/shop/"><button>Назад в Магазин</button></a>
</body>
</html>
