<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html> 
<head>
    <meta charset="utf-8">
    <link type="text/css" rel="stylesheet" href="/temp.css">
    <link rel="shortcut icon" type="image/x-icon" href="img/chat.png"/>
    <title>HELLO UNIX</title>
<script>
</script>
<style>
    * {padding:0; margin:0;}
    header{
        height:180px;
        background-color: #244e80;
        background-image: url(img/water.jpg);
        margin:auto;
    }
    body{
        background-color: white;
        align-content: center;
    }
    li{
        list-style:none;
    }
    nav li{
    	padding: 2px;
    }
    .web-title{
    	height:130px;
    	padding-top:20px;
    	background-image: url(img/water.jpg);
    	font-family:impact;
    	font-size:45px;
    	color: white;
    }

    .course-list::before{
        content:"";
        display: inline-block;
        width: 0;
        height: 0;
        border-top: 10px solid pink;
        border-right: 10px solid transparent;
    }
    a{
    	color:black;
        text-decoration: none;
    }
    .menu{
        display: block;
        color: #000;
        font-weight: bold;
        line-height: 30px;
        text-align: center;
        width:100px;
    }
    .menu:hover{
        color: #c0c0c0;
    }
    .web-menu{
        background-color: white
    }
    a:hover{
    	color: #c0c0c0;
    }
    .course{
        float:right;
    }
    .course-btn{
        float:left;
        padding:20px;
        margin: 5px;
    }
    .console{
        float:left;
        width: 200px;
        background-color: #fff;
    }
    .console-btn{
        float:right;
        padding:20px;
        margin: 5px;
    }
    .btn{
        background-color:white;
        border:white;
        outline: none;
        line-height: 500px;
    }
    nav{
        float: left;
        margin:10px;
    }
    content{
        float: left;
        margin: 10px;
        width: 700px;
        background-color: pink;
    }
    aside{
    	margin: 10px;
        float: left;
        background-color: #fff;
    }
    footer{
    	clear: both;
    	text-align: center;
    	padding-bottom: 10px;
    }
    footer p{
    	font-family: courier;
    	font-size: 20px;
    }
    .course-table{
    	border-collapse: collapse;
    }
    .course-tr{
    	border: 1px solid black;
    	padding: 10px;
    }
</style>
</head>
<body> 
    <header>
        <div align="right" class="web-menu">
        <table>
            <tr>
            <td><a href="#" class="menu">HOME</a>
            <td><a href="#" class="menu">ABOUT</a>
            <td><a href="#" class="menu">LOGIN</a>
            <td><a href="#" class="menu">CONTACT</a>
        </table>
        </div>
    	<div class="web-title" align="center">
    		<table>
    		<tr>
    			<td><img src="img/linux2.png" width="110px" height="110px"></td>
    			<td>HELLO </br>LINUX</td>
    		</tr></table>
    </header>
<nav>
    <div class="course">
    	<table id="course-table" class="course-table" cellspacing="0" cellpadding="0">
    	<tr><td class="course-tr">목록</td></tr>
    	<tr><td class="course-tr">
        <ul id="course-list">
        <li class="course-list"> Ch1. 리눅스란?
        	<ul>
        		<li><a href="#"> 1.1 리눅스 운영체제 </a></li>
        	</ul>
        </li>
        <li class="course-list"> Ch2. 리눅스 기본 명령어
        	<ul>
        		<li><a href="#"> 2.1 ls 명령어 </a></li>
        		<li><a href="#"> 2.2 cd 명령어 </a></li>
        		<li><a href="#"> 2.3 pwd 명령어 </a></li>
        		<li><a href="#"> 2.4 touch 명령어 </a></li>
        		<li><a href="#"> 2.5 rm 명령어 </a></li>
        		<li><a href="#"> 2.6 mkdir 명령어 </a></li>
        		<li><a href="#"> 2.7 rmdir 명령어 </a></li>
        		<li><a href="#"> 2.8 cp 명령어 </a></li>
        		<li><a href="#"> 2.9 mv 명령어 </a></li>
				<li><a href="#"> Test : 리눅스 기본 명령어 </a></li>
        	</ul>
        <li class="course-list"> Ch3. vi 사용하기</li>
        	<ul>
        	<li><a href="#"> 3.1 vi로 파일 작성하기 : 명령모드,</br> 
        	입력모드, 마지막줄 모드 1 </a></li>
        	<li><a href="#"> 3.2 vi로 파일 작성하기 : 명령모드,</br>
        	입력모드, 마지막줄 모드 2 </a></li>
        	</ul>
        </ul>
    </td></tr>
</table>
    </div>
    <div class="course-btn" >
        <input type="button" value="▶ 목록" class="btn" onclick="
    var target=document.querySelector('#course-table');
    if(this.value==='▶ 목록'){
        target.style.display='none';
        this.value='◀ 접기';
    }
    else{
        target.style.display='block';
        this.value='▶ 목록';
    }
    ">
    </div>
</nav>
<content>
	<div>
		::before [ 참고 http://www.w3schools.com/cssref/sel_before.asp ]

 

선택된 요소 앞에 내용을 삽입할 때 사용합니다.

.phone::before의 의미는 'phone클래스 앞에 무엇인가 넣는다'는 의미입니다. 

20 라인을 볼까요.

20라인은 무엇을 넣을 것인지 말해 주고 있습니다.

::before와 ::after는 위처럼 content property와 쓰이며

content property의 구조는 content: "value"(" " 는 value에 따라 생략된다)입니다.

 value인 는unicode icon으로써 오른쪽처럼 전화기 아이콘이 삽입 되었습니다.

즉, value가 삽입이 되고 그것을 우리가 화면상으로 볼 수 있습니다.

value값으로 올 수 있는 것은 문자, Unicode icon,이미지 또는 쉐입이 있습니다.

[content property 참고 http://www.w3schools.com/cssref/pr_gen_content.asp ]

<ul>
<ul>
<li>&nbsp;&nbsp;문학</li>
<li>사회</li>
<li>만화</li>
</ul>
</ul>
	</div>
</content>
<aside>
    <div class="console">
    	<ul id="console-list">
        <li class="course-list"> Ch1 : 리눅스란?
        	<ul>
        		<li><a href="#"> 1.1 리눅스 운영체제 </a></li>
        	</ul>
        <li class="course-list"> Ch2 : 리눅스 기본 명령어
        	<ul>
        		<li><a href="#"> 2.1 ls 명령어 </a></li>
        		<li><a href="#"> 2.2 cd 명령어 </a></li>
        		<li><a href="#"> 2.3 pwd 명령어 </a></li>
        		<li><a href="#"> 2.4 touch 명령어 </a></li>
        		<li><a href="#"> 2.5 rm 명령어 </a></li>
        		<li><a href="#"> 2.6 mkdir 명령어 </a></li>
        		<li><a href="#"> 2.7 rmdir 명령어 </a></li>
        		<li><a href="#"> 2.8 cp 명령어 </a></li>
        		<li><a href="#"> 2.9 mv 명령어 </a></li>
				<li><a href="#"> Test : 리눅스 기본 명령어 </a></li></ul>
				<li class="course-list"> Ch3 : vi 사용하기</li>
 		       	<li><a href="#"> 3.1 vi로 파일 작성하기 : 명령모드,</br> 
        			입력모드, 마지막줄 모드 1 </a></li>
        		<li><a href="#"> 3.2 vi로 파일 작성하기 : 명령모드,</br>
        		입력모드, 마지막줄 모드 2 </a></li>
        	</ul>
        
        	<ul>
        	</ul>
        </ul>
    </div>
    <div class="console-btn">
        <input type="button" value="목록" class="btn" onclick="
    var target=document.querySelector('#console-list');
    if(this.value==='목록'){
        target.style.display='none';
        this.value='접기';
    }
    else{
        target.style.display='block';
        this.value='목록';
    }
    ">
    </div>
</aside>
<footer>
	<hr size="3px" noshade color="#034A65">
	<div align="center">
	<table width="700px">
		<tr>
			<td><p>INFO</p>서비스 약관</br>개인정보취급방침</td>
			<td><p>CONTACT US</p>서울시 노원구 공릉동<br>서울과학기술대학교 320호</td>
			<td><p>GET SOCIAL</p><img src="img/chat.png" width="50px" height="50px"
				margin="20px" align="center">
			</td>
		</tr>
		<tr><td colspan="3">
		<br><br><br><br>
		<hr></td></tr>
	</table></div>
	<div>Copyright ⓒ 2016-2019 Hello Linux</div>
</footer>
</body>
</html>