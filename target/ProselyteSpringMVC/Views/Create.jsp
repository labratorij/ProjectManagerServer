<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add book</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/index.css"/>"/>
</head>
<body>
<div id="main">
    <div id="dialog">
        <div id="name1">
            <h2>Create task</h2>
        </div>

        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/create" method="POST">
                <label for="name">Name Task : </label>
                <input type="text" name="nameTask">
                <br>
                <label for="author">Task : </label>
                <input type="text" name="task">
                <br>
                <input type="submit" align="center" value="Ok"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
