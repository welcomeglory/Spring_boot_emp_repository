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
			<td>직원번호</td>
			<td>직원이름</td>
			<td>직무</td>
			<td>부서</td>
			<td>입사일</td>
			<td>월급</td>
			<td>보너스</td>
			<td>부서번호</td>
		</tr>
		<c:forEach var="emp" items="${emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td>${emp.sal}</td>
				<td>${emp.comm}</td>
				<td>${emp.deptno}</td>
				<!--				<td>
 	<a href="${pageContext.request.contextPath}/dept/remove?deptno=${dept.deptno}"><button type="button">삭제</button></a></td> -->
			</tr>
		</c:forEach>
	</table>
	<!--	<a href="${pageContext.request.contextPath}/dept/insert_view">부서입력</a>-->
</body>
</html>