<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit book</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/styly.css"/>"/>
</head>
<body>
<div id="main">
    <div id="header">
        <img width="860" src="../resources/images/head.png">
    </div>
    <div id="dialog">

        <div id="name2">
            <h2>Edit task</h2>
        </div>

        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/edit" method="POST">
                <label for="nameTask">Name Task : </label>
                <input type="text" name="nameTask">
                <br>
                <label for="task">Task : </label>
                <input type="text" name="task" class="sdvig">
                <br>
               <input type="submit" align="center" value="Edit" class="sub2"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
