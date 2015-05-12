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

<table border="1">
    <tr>
        <td>
            Наименование товара
        </td>
        <td>
            ${requestScope.good.name}
        </td>
    </tr>
    <tr>
        <td>
            Категория
        </td>
        <td>
            ${requestScope.category.name}
        </td>
    </tr>
    <tr>
        <td>
            Производитель
        </td>
        <td>
            ${requestScope.manufacturer.name}
        </td>
    </tr>
    <tr>
        <td>
            Есть на складе
        </td>
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
        <td>
            Цена
        </td>
        <td>
            ${requestScope.good.price}
        </td>
    </tr>
    <tr>
        <td>
            Описание товара
        </td>
        <td>
            <textarea name="description" rows="5" cols="70">${requestScope.good.description}</textarea>
        </td>
    </tr>

</table>
<a href="/shop/">
    <button>Назад в Магазин</button>
</a>

<c:if test="${sessionScope.user.role == 1}">
    <a href="controller?param=editGood&id=${requestScope.good.id}">
        <button>Edit</button>
    </a>
    <a href="controller?param=delGood&id=${requestScope.good.id}">
        <button>Delete</button>
    </a>
</c:if>
<c:if test="${sessionScope.user.role == 2}">
    <c:choose>
        <c:when test="${requestScope.good.count > 0}">
            <a href="controller?param=addIntoOrder&id=${requestScope.good.id}">
                <button>В корзину</button>
            </a>
        </c:when>
        <c:otherwise>
            <a href="controller?param=addIntoOrder&id=${requestScope.good.id}">
                <button disabled="disabled">В корзину</button>
            </a>
        </c:otherwise>
    </c:choose>
</c:if>

</body>
</html>