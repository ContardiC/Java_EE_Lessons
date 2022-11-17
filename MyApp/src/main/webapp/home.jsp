
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email=null;
if(session.getAttribute("email") == null){
	response.sendRedirect("login.jsp");
}else{
	email=(String)session.getAttribute("email");
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h3>Benvenuto <%=email %> </h3>
</body>
</html>