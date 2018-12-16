<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강 신청</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/docreate">
		<table class="formtable">
		
			<tr><td class="label"> Code : </td> <td><input class="control" type="text" name="code"/></td></tr>
			<tr><td class="label"> Classname : </td> <td><input class="control" type="text" name="classname"/></td></tr>
			<tr><td class="label"> Division : </td> <td><input class="control" type="text" name="division"/></td></tr>
			<tr><td class="label"> Grades : </td> <td><input class="control" type="text" name="grades"/></td></tr>
			
			<tr><td> </td> <td><input class="control" type="submit" value="새 제안"/></td></tr>
			
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</table>
	</form>
	
	<a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>