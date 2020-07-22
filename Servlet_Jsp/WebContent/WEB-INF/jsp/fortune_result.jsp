<%@ page import="jp.co.colla_tech.FortuneBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortuneResult =
(FortuneBean)request.getAttribute("fortuneResult"); %>
<meta charset="UTF-8">
<title>Fortune Result</title>
</head>
<body>
<%
    if(fortuneResult != null){
        out.println("<h1>↓" + fortuneResult.getToday() + "↓</h1>");
        out.println("<h1>" + fortuneResult.getFortune() + "</h1>");
    }
%>
</body>
</html>