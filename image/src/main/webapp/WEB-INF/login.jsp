<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    form {
        background-color: white;
        width: 250px;
        height: 250px;
        border-style: solid;
        border-color: black;
        padding: 20px;
        margin-top: 100px;
    }


</style>

<body >

<center>
<div>
    <form action="/login" method="get">
        <div><h2>Login Page !</h2></div>
        <c:if test="${not empty error}">
            <div style="color: red"><h3>${error}</h3></div>
        </c:if>

        <c:if test="${not empty registerSuccess}">
            <div style="color: red"><h3>${registerSuccess}</h3></div>
        </c:if>


        <c:if test="${not empty registrationError}">
            <div style="color: red"><h3>${registrationError}</h3></div>
        </c:if>


        <div> <input type="text" name="username" placeholder="username" value=""><br></div>
        <div><br></div>
        <div><input type="password" name="password"  placeholder="password" value=""></div>
        <div><br></div>
        <div><input type="submit" value="Login"  style="background-color: lime"></div>
        <div><br></div>
        <div><input type="button" value="Register" onclick="gotToRegister()" style="background-color: orange"></div>

    </form>

</div>
</center>
<script>
    function gotToRegister() {
        window.location.href = "/register"
    }


</script>
</body>
</html>