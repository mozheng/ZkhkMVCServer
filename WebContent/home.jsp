﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>简洁滑动解锁后台管理框架</title>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">LOGO</div>
		<div id="title">后台管理系统</div>
		<div id="menu">
			<div id="menu_container">
				<ul id="menu_items">
					<li class="menu_item on" style="border-radius:8px 0 0 8px" onMouseOut="this.style.backgroundColor=''" onMouseOver="this.style.backgroundColor='#77D1F6';this.style.borderRadius='8px 0 0 8px'"><a>系统管理</a></li>
					<li class="menu_item" onMouseOut="this.style.backgroundColor='';this.style.fontWeight='normal'" onMouseOver="this.style.backgroundColor='#77D1F6';this.style.fontWeight='bold'"><a>用户管理</a></li>
					<li class="menu_item" onMouseOut="this.style.backgroundColor='';this.style.fontWeight='normal'" onMouseOver="this.style.backgroundColor='#77D1F6';this.style.fontWeight='bold'"><a>新闻管理</a></li>
					<li class="menu_item" onMouseOut="this.style.backgroundColor='';this.style.fontWeight='normal'" onMouseOver="this.style.backgroundColor='#77D1F6';this.style.fontWeight='bold'"><a>网盘管理</a></li>
					<li class="menu_item" onMouseOut="this.style.backgroundColor='';this.style.fontWeight='normal'" onMouseOver="this.style.backgroundColor='#77D1F6';this.style.fontWeight='bold'"><a>相册管理</a></li>
					<li class="menu_item" style="border-radius:8px 0 0 8px;border:0px;" onMouseOut="this.style.backgroundColor='';this.style.fontWeight='normal'" onMouseOver="this.style.backgroundColor='#77D1F6';this.style.borderRadius='0 8px 8px 0';this.style.fontWeight='bold'"><a>邮件管理</a></li>
				</ul>
			</div>
		</div>
	<%Map <String,String> itemMap = (Map<String,String>)session.getAttribute("sessionMap"); %>
		<div id="user_info">
			<div id="welcome">欢迎 <%=itemMap.get("name") %> 使用本系统</div>
			<div id="logout">安全退出</div>
		</div>
	</div>
	<div id="navigator">
		<iframe src="tree.html"></iframe>
        </div>
	<div id="main">
		<iframe name="MainFrame" src="${ pageContext.request.contextPath }/servlet/SqliteUIServlet"></iframe>
	</div>
	<div id="footer">Copyright © 2009-2011 All Rights Reserved Powered By Nan Lei</div>
</div>
<div id="overlay">
</div>
<div id="slide">
    <span id="slider"></span>
    <span id="text">滑动解除锁定</span>
</div>

</body>
<script type="text/javascript">
function screenAdapter(){
	document.getElementById('footer').style.top=document.documentElement.scrollTop+document.documentElement.clientHeight- document.getElementById('footer').offsetHeight+"px";
		document.getElementById('navigator').style.height=document.documentElement.clientHeight-100+"px";
		document.getElementById('main').style.height=document.documentElement.clientHeight-100+"px";
		document.getElementById('main').style.width=window.screen.width-230+"px";
}

window.onscroll=function(){screenAdapter()};
window.onresize=function(){screenAdapter()};
window.onload=function(){screenAdapter()};
$(function() {
    var slideWidth=$("#slide").width();
    $("#slider").draggable({
        axis: 'x',
        containment: 'parent',
        drag: function(event, ui) {
            if (ui.position.left > slideWidth*0.7) {
                $("#slide").fadeOut();
                $("#overlay").fadeOut();
            } else {
                // Apparently Safari isn't allowing partial opacity on text with background clip? Not sure.
                //$("#text").css("opacity", 100 - (ui.position.left / 5));
            }
        },
        stop: function(event, ui) {
            if (ui.position.left < slideWidth*0.7) {
                $(this).animate({left: 0});
            }
        }
    });     
});
</script>
</html>