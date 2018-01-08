<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add book</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/styly.css"/>"/>
</head>
<body>
<div id="main">
    <div id="header">
        <img width="860" src="../resources/images/head.png">
    </div>
    <div id="dialog">
        <div id="name1">
            <h2>Create task</h2>
        </div>

        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/create" method="POST">
                <label for="name task">Name Task : </label>
                <input type="text" name="nameTask">
                <br>
                <label for="task">Task : </label>
                <input class="sdvig" type="text" name="task">
                <br>
                <input type="submit" align="center" value="Ok" class="sub2"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
