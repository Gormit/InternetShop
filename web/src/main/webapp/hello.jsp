<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Hallo page</title>
</head>
<body>

<div class="container">

    <jsp:include page="header.jsp"/>

    <div class="row" id="content">

        <jsp:include page="sidebar.jsp"/>

        <div class="span9">

            <table id="hello-table" class="table table-striped table-hover">
                <thead>
                <th>Наименование товара</th>
                <th>Цена</th>
                <th>Есть на складе</th>
                </thead>
                <tbody>
                <c:forEach var="good" items="${requestScope.goods}">
                    <tr>
                        <td><a href="/shop/view?id=${good.id}">${good.name}</a></td>
                        <td>${good.price}</td>
                        <td id="count">
                            <c:choose>
                                <c:when test="${good.count > 0}">
                                    ${good.count}
                                </c:when>
                                <c:otherwise>
                                    Прикинь, разобраллли!!!
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <c:if test="${sessionScope.user.role == 2}">
                                <c:choose>
                                    <c:when test="${good.count > 0}">
                                        <a href="controller?param=buy&id=${good.id}" class="btn btn-success">Купить</a>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="#" class="btn btn-danger disabled ">Купить</a>
                                    </c:otherwise>
                                </c:choose>
                            </c:if>
                            <c:if test="${sessionScope.user.role == 1}">
                                <a href="controller?param=editGood&id=${good.id}" class="btn btn-warning">Edit</a>
                                <a href="controller?param=delGood&id=${good.id}" class="btn btn-danger">Delete</a>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>
