<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>�������������� ������</title>

</head>
<body>

<div class="container">

    <jsp:include page="header.jsp"/>

    <div class="row" id="content">

        <jsp:include page="sidebar.jsp"/>

        <div class="span9">

            <form action="/shop/controller?param=saveEditGood" method="post">
                <input type="hidden" name="id" value="${requestScope.good.id}">

                <table id="view-table" class="table table-striped table-hover table-bordered">
                    <tr>
                        <td>������������ ������</td>
                        <td><input type="text" name="name" value="${requestScope.good.name}"></td>
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
                        <td><input type="text" name="count" pattern="[0-9]{1,64}" required title="��, ������ �������" value="${requestScope.good.count}">${invalidValue}</td>
                    </tr>
                    <tr>
                        <td>����</td>
                        <td><input type="text" name="price" pattern="[0-9]{1,64}" required title="��, ������ �������" value="${requestScope.good.price}">${invalidValue}</td>
                    </tr>
                    <tr>
                        <td>�������� ������</td>
                        <td><textarea name="description" rows="5" cols="70">${requestScope.good.description}</textarea></td>
                    </tr>
                </table>
                <input type="submit" name="���������" value="Save" class="btn btn-info">
            </form>
            <a href="/shop/" class="btn btn-info">����� � �������</a>

        </div>

    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>
