<%@ page language="java" contentType="text/html;  charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
</head>
<body>
本界面需要管理员权限才能注册用户
<form action=" ${ pageContext.request.contextPath }/servlet/RegisterServlet "  method = "post">
	<table>
	<tr>
		<td>用户</td>
		<td>
			<input type="text" name="rootname">
		</td>
	</tr>
	<tr>	
		<td>密码</td>
		<td>
			<input type="text" name="password">
		</td>
	</tr>
	</table>
	<input type="submit" class="btn" value="提交"/>

</form>

</body>
</html>