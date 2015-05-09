<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <title>Insert title here</title>
</head>
<body>

<table border="1">
    <tr>
        <td>
            ������������ ������
        </td>
        <td>
            ${requestScope.good.name}
        </td>
    </tr>
    <tr>
        <td>
            ���������
        </td>
        <td>
            ${requestScope.category.name}
        </td>
    </tr>
    <tr>
        <td>
            �������������
        </td>
        <td>
            ${requestScope.manufacturer.name}
        </td>
    </tr>
    <tr>
        <td>
            ���� �� ������
        </td>
        <td>
            ${requestScope.good.count}
        </td>
    </tr>
    <tr>
        <td>
            ����
        </td>
        <td>
            ${requestScope.good.price}
        </td>
    </tr>
    <tr>
        <td>
            �������� ������
        </td>
        <td>
            ${requestScope.good.description}
        </td>
    </tr>

</table>
<a href="/shop/controller"><button>����� � �������</button></a>

<c:if test="${sessionScope.user.role == 1}">
    <a href="controller?param=editGood&id=${requestScope.good.id}">
        <button>Edit</button>
    </a>
    <a href="controller?param=delGood&id=${requestScope.good.id}">
        <button>Delete</button>
    </a>
</c:if>

</body>
</html>