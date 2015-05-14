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

            <h1> БЛА БЛА ТЫ ЗАБАНЕН!!!</h1>

            <img src="img/bun.gif" class="img-polaroid">

            <br>

            <a href="/shop/" class="btn btn-info">Иди домой</a>

        </div>

    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>
