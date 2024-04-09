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
<h1>부서입력 페이지</h1>
	<form action="${pageContext.request.contextPath}/dept/register" method="POST">
		부서번호  : <input type="text" name="deptno"  size="20"><br> <!-- name은 VO변수이름과 동일 -->
		부서이름  : <input type="text" name="dname"  size="20"><br> 
		부서지역  : <input type="text" name="loc"  size="20"><br>
		 <input type="submit" value=" 입력">
		<input type="reset" value=" 리셋">
	</form>
</body>
</html>