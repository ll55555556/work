<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fw" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<button type="button" onclick="location.href='userSave.jsp'">增加</button>
	<table border="1px" width="400px">
		<thead>
			<tr>
				<th>编号</th>
				<th>用户名</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<fw:forEach items="${users}" var="u">
			<tr>
				<td>${u.userId}</td>
				<td>${u.userName}</td>
				<td>${u.userPwd}</td>
			</tr>
		</fw:forEach>
		</tbody>
	</table>
</body>
</html>