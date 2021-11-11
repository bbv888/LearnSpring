<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 10/11/2021
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Registration page</title>
</head>
<h1>Registration page</h1>

<form:form modelAttribute="registration">
    <table>
        <tr>
            <td>
                Name:
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add registration">
            </td>
        </tr>
    </table>
</form:form>

<body>

</body>
</html>
