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
                    <a href="/shop/controller?param=addGood" class="btn btn-info">�������� �����</a>
                    <a href="/shop/controller?param=userList" class="btn btn-danger">��������</a>
                </c:when>
            </c:choose>
        </div>
    </div>

    <div class="row" id="content">
        <div class="span2 sidebar">sidebar</div>
        <div class="span9">

            <table id="hello-table" class="table table-striped table-hover">
                <thead>
                <th>������������ ������</th>
                <th>����</th>
                <th>���� �� ������</th>
                </thead>
                <tbody>
                <c:forEach var="good" items="${requestScope.goods}">
                    <tr>
                        <td><a href="/shop/view?id=${good.id}">${good.name}</a></td>
                        <td>${good.price}</td>
                        <td>
                            <c:choose>
                                <c:when test="${good.count > 0}">
                                    ${good.count}
                                </c:when>
                                <c:otherwise>
                                    �������, �����������!!!
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>

    <div class="row" id="footer">
        <div class="span12">
            footer
        </div>
    </div>

</div>

</body>
</html>
