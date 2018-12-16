<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2019 수강 신청 내역</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<table>
		<tr>
			<td>수강년도</td>
			<td>학기</td>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>
	<c:forEach var="pregrade" items="${pregrades}">
		<tr>
			<td><c:out value="${pregrade.yearofstudy}"></c:out></td>
			<td><c:out value="${pregrade.semester}"></c:out></td>
			<td><c:out value="${pregrade.code}"></c:out></td>
			<td><c:out value="${pregrade.classname}"></c:out></td>
			<td><c:out value="${pregrade.division}"></c:out></td>
			<td><c:out value="${pregrade.grades}"></c:out></td>
		</tr>
	</c:forEach>
	</table>
	
	<a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>