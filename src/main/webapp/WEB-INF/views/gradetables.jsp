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
			<td>년도</td>
			<td>학기</td>
			<td>이수 학점</td>
			<td>상세보기</td>
		</tr>
		<tr>
			<td>2014</td>
			<td>1</td>
			<td><c:out value="${grade2014_1}"></c:out></td>
			<td><a href="${pageContext.request.contextPath}/gradeforyear?year=2014&semester=1">상세보기</a></td>
		</tr>
		<tr>
			<td>2014</td>
			<td>2</td>
			<td><c:out value="${grade2014_2}"></c:out></td>
			<td><a href="${pageContext.request.contextPath}/gradeforyear?year=2014&semester=2">상세보기</a></td>
		</tr>
		<tr>
			<td>2015</td>
			<td>1</td>
			<td><c:out value="${grade2015_1}"></c:out></td>
			<td><a href="${pageContext.request.contextPath}/gradeforyear?year=2015&semester=1">상세보기</a></td>
		</tr>
		<tr>
			<td>2017</td>
			<td>2</td>
			<td><c:out value="${grade2017_2}"></c:out></td>
			<td><a href="${pageContext.request.contextPath}/gradeforyear?year=2017&semester=2">상세보기</a></td>
		</tr>
		<tr>
			<td>2018</td>
			<td>1</td>
			<td><c:out value="${grade2018_1}"></c:out></td>
			<td><a href="${pageContext.request.contextPath}/gradeforyear?year=2018&semester=1">상세보기</a></td>
		</tr>
		<tr>
			<td>2018</td>
			<td>2</td>
			<td><c:out value="${grade2018_2}"></c:out></td>
			<td><a href="${pageContext.request.contextPath}/gradeforyear?year=2018&semester=2">상세보기</a></td>
		</tr>
	</table>
	
	<a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>