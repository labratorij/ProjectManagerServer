<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit book</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/index.css"/>"/>
</head>
<body>
<div id="main">

    <div id="dialog">

        <div id="name2">
            <h2>Edit task</h2>
        </div>

        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/edit" method="POST">
                <label for="name">New Name Task : </label>
                <input type="text" name="nameTask">
                <br>
                <label for="task">New Task : </label>
                <input type="text" name="task">
                <br>
               <input type="submit" align="center" value="Edit"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
