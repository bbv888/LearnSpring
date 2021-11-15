<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 10/11/2021
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Registration page</title>
</head>
<h1>Registration page</h1>


<body>
<header>
    <nav>
        <ul>
            <li><a href="index.html">Home</a></li>
        </ul>
    </nav>
</header>


<form:form modelAttribute="attendee">
    <table>
        <tr>
            <td>
                First Name:
            </td>
            <td>
                <form:input path="first_name" />
            </td>
        </tr>
        <tr>
            <td>
                Last Name:
            </td>
            <td>
                <form:input path="last_name" />
            </td>
        </tr>
        <tr>
            <td>
                Email:
            </td>
            <td>
                <form:input path="email" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add registration">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
