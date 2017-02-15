<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is input Info Page</title>
</head>
<body style="background: #999">
	<form action="goto-show.action" method="post">
		UserName:<input type="text" name="userName" id="userName">
		<br><br>
		UserAccout:<input type="text" name="userAccount" id="userAccount">
		<br><br>
		UserPassword:<input type="text" name="userPwd" id="userPwd">
		<br><br>
		<input type="submit" value="提交信息">	
	</form>
</body>
</html>