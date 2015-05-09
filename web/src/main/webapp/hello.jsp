<%@ page language="java" contentType="text/html; charset=cp1251" pageEncoding="cp1251" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=cp1251">
  <title>Insert title here</title>
</head>
<body>
<c:choose>
  <c:when test="${sessionScope.user == null}">
    <a href = "/shop/controller?param=login"><input type = "button" value = "����"></a>
    <a href = "/shop/controller?param=registration"><input type = "button" value = "�����������"></a>
  </c:when>
</c:choose>

<table>
  <tr>
    <td>
      <c:choose>
        <c:when test="${sessionScope.user != null}">
          ����� ���������� ${sessionScope.user.firstname}
        </c:when>
        <c:otherwise>
          ����� ���������� � ��� �������!!
        </c:otherwise>
      </c:choose>
    </td>
  </tr>
  <c:forEach var="good" items="${requestScope.goods}">
    <tr><td><a href = "/shop/view?id=${good.id}">${good.name}</a></td></tr>
  </c:forEach>
</table>
<br>
<c:choose>
  <c:when test="${sessionScope.user.role == 2}">
    <a href="/shop/account?action=logout"><button>�����</button></a>
  </c:when>
  <c:when test="${sessionScope.user.role == 1}">
    <a href="/shop/account?action=logout"><button>�����</button></a>
    <a href="/shop/controller?param=addGood"><button>�������� �����</button></a>
  </c:when>
</c:choose>
</body>
</html>
