<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Insert title here</title>
</head>
<body>

<div class="container">

    <jsp:include page="header.jsp"/>

    <div class="row" id="content">

        <jsp:include page="sidebar.jsp"/>

        <div class="span9">

            <table id="view-table" class="table table-striped table-hover table-bordered">
                <tr>
                    <td>Наименование товара</td>
                    <td>
                        ${requestScope.good.name}
                    </td>
                </tr>
                <tr>
                    <td>Категория</td>
                    <td>
                        ${requestScope.category.name}
                    </td>
                </tr>
                <tr>
                    <td>Производитель</td>
                    <td>
                        ${requestScope.manufacturer.name}
                    </td>
                </tr>
                <tr>
                    <td>Есть на складе</td>
                    <td>
                        <c:choose>
                            <c:when test="${requestScope.good.count > 0}">
                                ${requestScope.good.count}
                            </c:when>
                            <c:otherwise>
                                <span style="color: red; ">Нет этой фигни на складе</span>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <tr>
                    <td>Цена</td>
                    <td>
                        ${requestScope.good.price}
                    </td>
                </tr>
                <tr>
                    <td>Описание Товара</td>
                    <td id="textarea">
                        ${requestScope.good.description}
                    </td>
                </tr>
            </table>

            <a href="/shop/" class="btn btn-info">Назад в Магазин</a>

            <c:if test="${sessionScope.user.role == 1}">
                <a href="controller?param=editGood&id=${requestScope.good.id}" class="btn btn-warning">Edit</a>
                <a href="controller?param=delGood&id=${requestScope.good.id}" class="btn btn-danger">Delete</a>
            </c:if>
            <c:if test="${sessionScope.user.role == 2}">
                <c:choose>
                    <c:when test="${requestScope.good.count > 0}">
                        <a href="controller?param=addIntoOrder&id=${requestScope.good.id}"
                           class="btn btn-info" onclick="">Купить</a>
                    </c:when>
                    <c:otherwise>
                        <a href="#" class="btn btn-info disabled ">Купить</a>
                    </c:otherwise>
                </c:choose>
            </c:if>
        </div>
    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>