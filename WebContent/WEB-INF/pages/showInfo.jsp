<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is the show info Page</title>
</head>
<body style="background: #999">
		UserName:${requestScope.user.userName}
		<br><br>
		UserAccount:${requestScope.user.userAccount}
		<br><br>
		UserPwd:${requestScope.user.userPwd}
</body>
</html>