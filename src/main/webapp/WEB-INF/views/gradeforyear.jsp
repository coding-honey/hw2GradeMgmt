<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학기별 이수 학점 조회</title>
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
	<c:forEach var="gradetable" items="${gradetables}">
		<tr>
			<td><c:out value="${gradetable.yearofstudy}"></c:out></td>
			<td><c:out value="${gradetable.semester}"></c:out></td>
			<td><c:out value="${gradetable.code}"></c:out></td>
			<td><c:out value="${gradetable.classname}"></c:out></td>
			<td><c:out value="${gradetable.division}"></c:out></td>
			<td><c:out value="${gradetable.grades}"></c:out></td>
		</tr>
	</c:forEach>
	</table>
	
	<a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>