<%--
  Created by IntelliJ IDEA.
  User: fly
  Date: 10/22/17
  Time: 1:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>customer</title>
</head>
<body>

<h1>list</h1>
<table>
    <tr>
        <th>name</th>
        <th>contact</th>
        <th>tel</th>
        <th>email</th>
        <th>remark</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>
                <a href="${BASE}/customer_edit?id=${customer.id}">edit</a>
                <a href="${BASE}/cutomer_delete?id=${customer.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
