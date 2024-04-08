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
	<form action="/dept/register" method="POST">
		번호 <input type="text" name="deptno" ><br> 
		이름 <input type="text" name="dname" ><br> 
		지역 <input type="text" name="loc" ><br>
		 <input type="submit" value=" 입력">
		<input type="reset" value=" 리셋">
	</form>
</body>
</html>