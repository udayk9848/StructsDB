<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<html>
<head>
   <style>

body{
	font-family:Tahoma, Geneva, sans-serif;
	}

   table, th, td {
    border: 1px solid green;
    
}
th {
    background-color: green;
    color: white;
}

</style>
</head>
<body bgcolor=#F0E0B2>
<br></br>
<body>
<body>

   <jsp:include page="UserManagement.jsp" />
  <br>
  <h3>
    <font color="blue">
    <center><%= session.getAttribute("message") %><center></font> 
    </h3>
  <table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>		
    <th>userName</th>
    <th>passWord</th>
    <th>email</th>
    <th>phone</th>
  </tr>
  <tr>
    <td><%=session.getAttribute("firstName") %></td>
    <td><%=session.getAttribute("lastName") %></td>		
    <td><%=session.getAttribute("userName") %></td>
    <td><%=session.getAttribute("passWord") %></td>
    <td><%=session.getAttribute("email") %></td>		
    <td><%=session.getAttribute("phone") %></td>
    
  </tr>
</table>

</body>
</html>