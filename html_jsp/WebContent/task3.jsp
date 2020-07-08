<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<%! int count = 0; %>
<meta charset="UTF-8">
<title>task3</title>
</head>
<body>
    <% Calendar cal = Calendar.getInstance();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
       Date now = new Date();
    %>
<h1>訪問回数：<%= count++  %>回</h1>
<p>今日の日付：<%= sdf.format(now)  %></p>
</body>
</html>