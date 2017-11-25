<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <title>Books</title>
    <link rel="stylesheet" type="text/css" href="../resources/css/index.css" />
</head>

<body>
<div id="main">
    <div id="dialog">
        <form action="${pageContext.servletContext.contextPath}/search" method="GET">
                <label id = "inputLabel" for="nameTask">Search by Name task:</label>
                <input id = "inputContainer" type="text" name="nameTask">
                <td><input type="submit" value="Ok"/></td>
        </form>
        <a href="${pageContext.servletContext.contextPath}/Views/Create.jsp">Add Book</a>
        <a href="${pageContext.servletContext.contextPath}/">Reset search</a>
        <br><br><table>
            <tr>
                <td>NameTask</td>
                <td>task</td>
                <td></td>
            </tr>
            <c:forEach items="${tasks}" var="tasks" varStatus="status">
            <tr valign="top">
                <td>${tasks.getNameTask()}</td>
                <td>${tasks.getTask()}</td>
                <td>
                    <a href="${pageContext.servletContext.contextPath}/delete?id=${tasks.id}">Delete</a>
                    <a href="${pageContext.servletContext.contextPath}/edit_id?id=${tasks.id}">Edit</a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
