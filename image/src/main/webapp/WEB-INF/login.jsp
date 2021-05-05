<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    form {
        background-color: aqua;
        width: 250px;
        height: 200px;
        border-style: solid;
        border-color: black;
        padding: 10px;
    }


</style>

<body>

<div>
    <form action="/login" method="get">
        <c:if test="${not empty error}">
            <div style="color: yellow"><h3>${error}</h3></div>
        </c:if>

        <c:if test="${not empty registerSuccess}">
            <div style="color: red"><h3>${registerSuccess}</h3></div>
        </c:if>


        <c:if test="${not empty registrationError}">
            <div style="color: red"><h3>${registrationError}</h3></div>
        </c:if>

        <div>username: <input type="text" name="username" value=""><br></div>
        <div><br></div>
        <div>password: <input type="password" name="password" value=""></div>
        <div><br></div>
        <div><input type="submit" value="Login" style="background-color: lime"></div>
        <div><br></div>
        <div><input type="button" value="Register" onclick="gotToRegister()" style="background-color: orange"></div>

    </form>

</div>
<script>
    function gotToRegister() {
        window.location.href = "/register"
    }


</script>
</body>
</html>