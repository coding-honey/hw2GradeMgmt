<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강 신청 완료</title>
</head>
<body>
<c:out value="${pregrade.classname}"></c:out>과목이 2019년도 1학기 수강 신청되었습니다.<br>

<a href="${pageContext.request.contextPath}/pregrades">수강 신청 조회</a>
<a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>