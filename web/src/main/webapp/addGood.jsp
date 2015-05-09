<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <title>���������� ������</title>
</head>
<body>
<form action="/shop/controller?param=saveGood" method="post">
    <table border="1">
        <tr>
            <td>��������</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>���������</td>
            <td>
                <select name="category">
                    <option value="1">�����-�����</option>
                    <option value="2">���������</option>
                    <option value="3">����������</option>
                    <option value="4">������� �������</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>�������������</td>
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
            <td>������� ��������� �� �����</td>
            <td><input type="text" name="count"></td>
        </tr>
        <tr>
            <td>����</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>��������</td>
            <td><textarea name="description" rows="5" cols="70"></textarea></td>
        </tr>
    </table>
    <input type="submit" name="��������" value="Save">
</form>
<a href="/shop/controller"><button>����� � �������</button></a>
</body>
</html>