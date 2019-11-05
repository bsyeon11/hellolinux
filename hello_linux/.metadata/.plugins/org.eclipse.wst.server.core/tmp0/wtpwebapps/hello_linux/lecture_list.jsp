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
    	<tr><td class="course-tr">���</td></tr>
    	<tr><td class="course-tr">
        <ul id="course-list">
        <li class="course-list"> Ch1. ��������?
        	<ul>
        		<li><a href="#"> 1.1 ������ �ü�� </a></li>
        	</ul>
        </li>
        <li class="course-list"> Ch2. ������ �⺻ ��ɾ�
        	<ul>
        		<li><a href="#"> 2.1 ls ��ɾ� </a></li>
        		<li><a href="#"> 2.2 cd ��ɾ� </a></li>
        		<li><a href="#"> 2.3 pwd ��ɾ� </a></li>
        		<li><a href="#"> 2.4 touch ��ɾ� </a></li>
        		<li><a href="#"> 2.5 rm ��ɾ� </a></li>
        		<li><a href="#"> 2.6 mkdir ��ɾ� </a></li>
        		<li><a href="#"> 2.7 rmdir ��ɾ� </a></li>
        		<li><a href="#"> 2.8 cp ��ɾ� </a></li>
        		<li><a href="#"> 2.9 mv ��ɾ� </a></li>
				<li><a href="#"> Test : ������ �⺻ ��ɾ� </a></li>
        	</ul>
        <li class="course-list"> Ch3. vi ����ϱ�</li>
        	<ul>
        	<li><a href="#"> 3.1 vi�� ���� �ۼ��ϱ� : ��ɸ��,</br> 
        	�Է¸��, �������� ��� 1 </a></li>
        	<li><a href="#"> 3.2 vi�� ���� �ۼ��ϱ� : ��ɸ��,</br>
        	�Է¸��, �������� ��� 2 </a></li>
        	</ul>
        </ul>
    </td></tr>
</table>
    </div>
    <div class="course-btn" >
        <input type="button" value="�� ���" class="btn" onclick="
    var target=document.querySelector('#course-table');
    if(this.value==='�� ���'){
        target.style.display='none';
        this.value='�� ����';
    }
    else{
        target.style.display='block';
        this.value='�� ���';
    }
    ">
    </div>
</nav>
<content>
	<div>
		::before [ ���� http://www.w3schools.com/cssref/sel_before.asp ]

 

���õ� ��� �տ� ������ ������ �� ����մϴ�.

.phone::before�� �ǹ̴� 'phoneŬ���� �տ� �����ΰ� �ִ´�'�� �ǹ��Դϴ�. 

20 ������ �����.

20������ ������ ���� ������ ���� �ְ� �ֽ��ϴ�.

::before�� ::after�� ��ó�� content property�� ���̸�

content property�� ������ content: "value"(" " �� value�� ���� �����ȴ�)�Դϴ�.

 value�� ��unicode icon���ν� ������ó�� ��ȭ�� �������� ���� �Ǿ����ϴ�.

��, value�� ������ �ǰ� �װ��� �츮�� ȭ������� �� �� �ֽ��ϴ�.

value������ �� �� �ִ� ���� ����, Unicode icon,�̹��� �Ǵ� ������ �ֽ��ϴ�.

[content property ���� http://www.w3schools.com/cssref/pr_gen_content.asp ]

<ul>
<ul>
<li>&nbsp;&nbsp;����</li>
<li>��ȸ</li>
<li>��ȭ</li>
</ul>
</ul>
	</div>
</content>
<aside>
    <div class="console">
    	<ul id="console-list">
        <li class="course-list"> Ch1 : ��������?
        	<ul>
        		<li><a href="#"> 1.1 ������ �ü�� </a></li>
        	</ul>
        <li class="course-list"> Ch2 : ������ �⺻ ��ɾ�
        	<ul>
        		<li><a href="#"> 2.1 ls ��ɾ� </a></li>
        		<li><a href="#"> 2.2 cd ��ɾ� </a></li>
        		<li><a href="#"> 2.3 pwd ��ɾ� </a></li>
        		<li><a href="#"> 2.4 touch ��ɾ� </a></li>
        		<li><a href="#"> 2.5 rm ��ɾ� </a></li>
        		<li><a href="#"> 2.6 mkdir ��ɾ� </a></li>
        		<li><a href="#"> 2.7 rmdir ��ɾ� </a></li>
        		<li><a href="#"> 2.8 cp ��ɾ� </a></li>
        		<li><a href="#"> 2.9 mv ��ɾ� </a></li>
				<li><a href="#"> Test : ������ �⺻ ��ɾ� </a></li></ul>
				<li class="course-list"> Ch3 : vi ����ϱ�</li>
 		       	<li><a href="#"> 3.1 vi�� ���� �ۼ��ϱ� : ��ɸ��,</br> 
        			�Է¸��, �������� ��� 1 </a></li>
        		<li><a href="#"> 3.2 vi�� ���� �ۼ��ϱ� : ��ɸ��,</br>
        		�Է¸��, �������� ��� 2 </a></li>
        	</ul>
        
        	<ul>
        	</ul>
        </ul>
    </div>
    <div class="console-btn">
        <input type="button" value="���" class="btn" onclick="
    var target=document.querySelector('#console-list');
    if(this.value==='���'){
        target.style.display='none';
        this.value='����';
    }
    else{
        target.style.display='block';
        this.value='���';
    }
    ">
    </div>
</aside>
<footer>
	<hr size="3px" noshade color="#034A65">
	<div align="center">
	<table width="700px">
		<tr>
			<td><p>INFO</p>���� ���</br>����������޹�ħ</td>
			<td><p>CONTACT US</p>����� ����� ������<br>������б�����б� 320ȣ</td>
			<td><p>GET SOCIAL</p><img src="img/chat.png" width="50px" height="50px"
				margin="20px" align="center">
			</td>
		</tr>
		<tr><td colspan="3">
		<br><br><br><br>
		<hr></td></tr>
	</table></div>
	<div>Copyright �� 2016-2019 Hello Linux</div>
</footer>
</body>
</html>