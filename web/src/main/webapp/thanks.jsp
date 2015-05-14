<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Thanks page</title>
</head>
<body>

<div class="container">

    <jsp:include page="header.jsp"/>

    <div class="row" id="content">

        <jsp:include page="sidebar.jsp"/>

        <div class="span9">

            <h1> БЛА БЛА СПС ЗА РЕГИСТРАЦУИЮ!!!</h1>

            <img src="img/pop.gif" class="img-polaroid">

            <br>

            <a href="/shop/controller?param=login" class="btn btn-info">Иди залогинься</a>

        </div>

    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>