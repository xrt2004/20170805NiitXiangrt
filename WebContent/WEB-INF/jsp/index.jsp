<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	学生管理信息
	<form method="post" action="<%=request.getContextPath()%>/users/login">
		姓名:<input type="text" name="username"/>
		密码：<input type="password" name="password"/>
		<input type="submit" value="提  交"/>
	</form>

</body>
</html>