<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload='document.f.username.focus();'>
	<h3>Custom Login ( gradetable search )</h3>
	
	<c:if test="${not empty logoutMsg}">
		<div style="color:#00f"> <h3>${logoutMsg}</h3></div>
	</c:if>
	
	<c:if test="${not empty errorMsg}">
		<div style="color:#f00"> <h3>${errorMsg}</h3></div>
	</c:if>
	
	<form name='f' action="<c:url value="/login"/>" method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</table>
	</form>
</body>
</html>