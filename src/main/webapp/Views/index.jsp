<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <title>ProjectManager</title>
    <link rel="stylesheet" type="text/css" href="../resources/css/styly.css" />
</head>

<body>
<div id="main">
    <div id="header">
        <img width="860" src="../resources/images/head.png">
    </div>
    <div id="dialog">
        <form action="${pageContext.servletContext.contextPath}/search" method="GET">
                <label id = "inputLabel" for="nameTask">Search by Name task:</label>
                <input id = "inputContainer" type="text" name="nameTask">
                <input type="submit" value="Ok" class="sub"/>
        </form>
        <div id="center">
        <a class = "one" href="${pageContext.servletContext.contextPath}/Views/Create.jsp">Add task</a>
        <a class = "one" href="${pageContext.servletContext.contextPath}/">Reset</a>
        </div>
        <br><br><table>
            <tr>
                <th class="min">NameTask</th>
                <th class="max">task</th>
                <th></th>
            </tr>
            <c:forEach items="${tasks}" var="tasks" varStatus="status">
            <tr valign="top">
                <td class="min">${tasks.getNameTask()}</td>
                <td class="max">${tasks.getTask()}</td>
                <td>
                    <a class = "two" href="${pageContext.servletContext.contextPath}/delete?id=${tasks.id}">Delete</a>
                    <a class="two" href="${pageContext.servletContext.contextPath}/edit_id?id=${tasks.id}">Edit</a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
