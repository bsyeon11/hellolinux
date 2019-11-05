<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
    <meta charset="utf-8">
    <link type="text/css" rel="stylesheet" href="/temp.css">
    <link rel="shortcut icon" type="image/x-icon" href="img/chat.png"/>
    <title>HELLO UNIX</title>
<script type="text/javascript">
    function btnclick(){
        location.href="lecture_list.jsp"
    }
</script>
<style>
    * {padding:0; margin:0;}
    header{
        height:400px;
        background-color: #244e80;
        background-image: url(img/water.jpg);
        margin:auto;
    }
    body{
        background-color: #034A65;
        align-content: center;
    }
    a{
        color:black;
        text-decoration: none;
    }
    .web-menu{
        height: 30px;
    }
    .menu{
        display: block;
        color: #fff;
        font-weight: bold;
        line-height: 30px;
        text-align: center;
        width:100px;
    }
    span{
        font-weight: bold;
        line-height: 200px;
        font-size: 70px;
        font-family: impact;
        text-align: center;
        color: white;
    }
    .linux{
        color: #fb9f1e;
    }
    p{
        font-family: Verdana;
        color:white;
    }
    button{
        background-color: #fb9f1e;
        color: white;
        font-family: impact;
        font-size:20px;
        border:white;
        outline: none;
        width: 100px;
    }
    .body{
        color: white;
    }
    header td{
        width: 100px;
    }
</style>
</head>
<body> 
    <header>
        <div align="right">
    	<table class="web-menu">
            <tr>
            <td><img src="img/chat.png" width="50px" height="50px">
            <td class="menu">hello linux</td>
            <td><td><td>
            <td><a href="#" class="menu">HOME</a>
            <td><a href="#" class="menu">ABOUT</a>
            <td><a href="#" class="menu">LOGIN</a>
            <td><a href="#" class="menu">CONTACT</a>
        </table>
        </div>
        <div align="center">
            <span>HELLO </span>
            <span class="linux">LINUX </span>
            <p>LEARN LINUX IN BETTER WAY AND LEVEL UP YOUR CAREER</p>
        <button type="button" onclick="btnclick()">go to learn</button>
        </div>
    </div>
    </header>
    <div class="body">
        our services
    </div>
</body>
</html>