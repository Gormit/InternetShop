<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
    <link rel="stylesheet" href="style/style.css">
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <script src="js/bootstrap.min.js" type="javascript"></script>
    <title>Редактирование товара</title>
</head>
<body>

<div class="container">

    <jsp:include page="header.jsp"/>

    <div class="row" id="content">

        <jsp:include page="sidebar.jsp"/>

        <div class="span9">

            <legend>Registration</legend>
            <h3>${message }</h3><br>

            <form method="post" action="/shop/registration" class="form-horizontal">
                <div class="control-group">
                    <label class="control-label">Имя</label>

                    <div class="controls">
                        <input type="text" name="firstname" placeholder="Firstname">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">Фамилия</label>

                    <div class="controls">
                        <input type="text" name="lastname" placeholder="Lastname">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">Email</label>

                    <div class="controls">
                        <input type="text" name="mail" placeholder="Email">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">Password</label>

                    <div class="controls">
                        <input type="password" name="password" id="inputPassword" placeholder="Password">
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <button type="submit" class="btn btn-info">Зарегистрироваться</button>
                        <a href="/shop/" class="btn btn-info">Назад в Магазин</a>
                    </div>
                </div>
            </form>

        </div>

    </div>

    <jsp:include page="footer.jsp"/>

</div>

</body>
</html>
