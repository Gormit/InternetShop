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

<div class="row" id="header">
    <div class="span12">
        <h2>
            <c:choose>
                <c:when test="${sessionScope.user != null}">
                    ����� ���������� ${sessionScope.user.firstname}
                </c:when>
                <c:otherwise>
                    ����� ���������� � ��� �������!!
                </c:otherwise>
            </c:choose>
        </h2>
        <c:choose>
            <c:when test="${sessionScope.user == null}">
                <a href="/shop/controller?param=login" class="btn btn-info">����</a>

                <a href="registration.jsp" class="btn btn-info">�����������</a>
            </c:when>
        </c:choose>
        <c:choose>
            <c:when test="${sessionScope.user.role == 2}">
                <a href="/shop/account?action=logout" class="btn btn-info">�����</a>
            </c:when>
            <c:when test="${sessionScope.user.role == 1}">
                <a href="/shop/account?action=logout" class="btn btn-info">�����</a>
                <a href="editGood.jsp" class="btn btn-info">�������� �����</a>
                <a href="/shop/controller?param=userList" class="btn btn-danger">��������</a>
            </c:when>
        </c:choose>
    </div>
</div>

</body>
</html>
