<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<style>
    form {
        background-color: #95f5d0;
        width: 350px;
        height: 200px;
        border-style: solid;
        border-color: black;
        padding: 10px;
    }


</style>


<body>


<div>
    <form action="/set-user" method="post">
        <div><h2>Registration Page !</h2></div>


        <div>username: <input type="text" name="username" value=""><br></div>
        <div><br></div>
        <div>firstName:<input type="text" name="firstname" value=""></div>
        <div><br></div>
        <div>lastName:<input type="text" name="lastname" value=""></div>
        <div><br></div>
        <div>age:<input type="text" name="age" value=""></div>
        <div><br></div>
        <div>password: <input type="password" name="password" value=""></div>
        <div><br></div>
        <div><input type="submit" value="Register" style="background-color: orange"></div>

    </form>

</div>

</body>
</html>

