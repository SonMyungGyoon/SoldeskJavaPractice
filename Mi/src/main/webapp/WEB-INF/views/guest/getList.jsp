<%@page import="java.util.ArrayList"%>
<%@page import="com.peisia.domain.GuestVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common.css" >
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<td>글번호</td>
		<td>글내용</td>
	</tr>
<!-- jstl 로 처리하면 더 짧게 가능 -->
<c:forEach var="guest" items="${list}">
	<tr>
		<td>${guest.bno}</td>
		<td><a href="/spring/guest/read?bno=${guest.bno}">${guest.btext}</a></td>
    </tr>
</c:forEach>

</table>

<a href="/spring/guest/write">새글 쓰기</a>

<%-- <c:forEach var="guest" items="${list}"> --%>
<%--     <c:set var="bno" value="${guest.bno}" /> --%>
<%--     <c:set var="btext" value="${guest.btext}" /> --%>
<%--     ${bno} --%>
<%--     ${btext} --%>
<!--     <hr> -->
<%-- </c:forEach> --%>

</body>
</html>