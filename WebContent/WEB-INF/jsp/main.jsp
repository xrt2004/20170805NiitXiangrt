<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<c:forEach items="${users}" var="user">
            <tr>
            	<td>${user.id}</td>
           	 	<td>${user.username}</td>
           	 	<td><a href="<%=request.getContextPath()%>/users/update?id=${user.id}">修改</a></td>
           	 	<td><a href="<%=request.getContextPath()%>/users/delete?id=${user.id}">删除</a></td>
           	 	<td>删除</td>
           	</tr>
        </c:forEach>
	</table>
</body>
</html>