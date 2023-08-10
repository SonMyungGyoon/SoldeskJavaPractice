<%@page import="com.peisia.domain.GuestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	GuestVO read = (GuestVO)request.getAttribute("read");
	long bno = read.getBno();
	String btext = read.getBtext();
%>	

글본문
글번호:<%=bno %>
글내용:<%=btext %>

<p><a href="/spring/guest/del?bno=${read.bno}">글 삭제</a></p>
<p><a href="/spring/guest/modify?bno=${read.bno}">글 수정</a></p>
<p><a href="/spring/guest/getList">글 리스트</a></p>
</body>
</html>