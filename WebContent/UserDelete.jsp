<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body bgcolor=#F0E0B2>


<jsp:include page="Delete.jsp" />
<table><tr>

<center>
    <font color="blue"><h3><%=session.getAttribute("userName") %><br>
    <%= session.getAttribute("message") %></h3></font> 
    <center>

</table>


</body>
</html>