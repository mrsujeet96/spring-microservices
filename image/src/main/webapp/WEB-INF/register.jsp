<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<style>
    form {
        margin-top: 70px;
        background-color: white;
        width: 400px;
        height: 400px;
        border-style: solid;
        border-color: black;
        padding: 10px;
    }


</style>


<body>

<center>
<div>
    <form action="/set-user" method="post">
        <div><h2>Registration Page !</h2></div>

        <div><input type="text" name="username" placeholder="UserName" value=""><br></div>
        <div><br></div>
        <div><input type="text" name="firstname"  placeholder="firstName" value=""></div>
        <div><br></div>
        <div><input type="text" name="lastname" placeholder="lastName" value=""></div>
        <div><br></div>
        <div><input type="text" name="age"  placeholder="age" value=""></div>
        <div><br></div>
        <div><input type="password" name="password"  placeholder="password" value=""></div>
        <div><br></div>
        <div><input type="submit" value="Register" onclick="validate()" style="background-color: orange"></div>

    </form>

</div>
</center>

<script>
    function validate(){

    }


</script>

</body>


</html>

