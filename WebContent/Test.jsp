<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Bonjour</title>
</head>
<body>
	<h1>Bonjour</h1>
	
	<ul>
		<%for (int i=0; i<10; i++) {%>
			<li><% out.print(i); %></li>
			<% } %>
	</ul>
</body>
</html>