<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="800" align="center">	
	<caption><h3>员工管理</h3></caption>
	<tr>
		<th>员工编号</th>
		<th>员工姓名</th>
		<th>员工密码</th>
		<th>编辑</th>
	</tr>
	<u:forEach items="${users}" var="l">
		<tr>
			<th>${l.userId}</th>
			<th>${l.userName}</th>
			<th>${l.userPwd}</th>
			<th>
				<a href="findOne.do?userId=${l.userId}">修改</a>
				<a href="delete.do?userId=${l.userId}">删除</a>
			</th>
		</tr>
	</u:forEach>
</table>
<input type="button" onclick="location.href=''">
</body>
</html>