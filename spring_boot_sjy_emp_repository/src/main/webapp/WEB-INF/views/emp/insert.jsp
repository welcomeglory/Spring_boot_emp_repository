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
<h1>직원입력 페이지</h1>
	<form action="${pageContext.request.contextPath}/emp/register" method="POST">
		직원번호  : <input type="text" name="empno"  size="20"><br> 
		직원이름  : <input type="text" name="ename"  size="20"><br> 
		직무  : <input type="text" name="job"  size="20"><br>
			부서  : <input type="text" name="mgr"  size="20"><br> 
		입사일  : <input type="text" name="hiredate"  size="20"><br> 
		월급  : <input type="text" name="sal"  size="20"><br>
			보너스  : <input type="text" name="comm"  size="20"><br> 
		부서번호  : <input type="text" name="deptno"  size="20"><br> 
		 <input type="submit" value=" 입력">
		<input type="reset" value=" 리셋">
	</form>
</body>
</html>