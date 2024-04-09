<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>지역</td>
			<td>삭제</td>
		</tr>
		<c:forEach var="dept" items="${depts}">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
				<td>
				<a href="${pageContext.request.contextPath}/dept/remove?deptno=${dept.deptno}"><button type="button">삭제</button></a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/dept/insert_view">부서입력</a>
</body>
</html>