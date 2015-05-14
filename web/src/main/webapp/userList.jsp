<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Users List page</title>
</head>
<body>

<div class="container">

    <jsp:include page="header.jsp"/>

    <div class="row" id="content">

        <jsp:include page="sidebar.jsp"/>

        <div class="span9">

            <table id="hello-table" class="table table-striped table-hover">
                <thead>
                <th>Имя</th>
                <th>Фамилия</th>
                <th>Мыло</th>
                <th>Пароль</th>
                <th>Вердикт</th>
                </thead>
                <tbody>
                <c:forEach var="user" items="${requestScope.users}">
                    <tr>
                        <td>${user.firstname}</td>
                        <td>${user.lastname}</td>
                        <td>${user.mail}</td>
                        <td>${user.password}</td>
                        <td>
                            <c:choose>
                                <c:when test="${user.bunned == 1}">
                                    <a href="/shop/controller?param=changeBunStatus&id=${user.id}"
                                       class="btn btn-success">Помиловать</a>
                                </c:when>
                                <c:when test="${user.bunned == 0}">
                                    <a href="/shop/controller?param=changeBunStatus&id=${user.id}"
                                       class="btn btn-danger">Казнить</a>
                                </c:when>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a href="/shop/" class="btn btn-info">Назад в Магазин</a>

        </div>

    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>
