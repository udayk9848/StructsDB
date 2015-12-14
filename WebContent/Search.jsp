<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.uday.struts.dao.EmpPojo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>

<html>
<head>
  <style type="text/css">
  h3 {
    color: orange;
    text-align: center;  
}

  table, th, td {
    border: 1px solid green;
    
}
th {
    background-color: green;
    color: white;
}
input[type=text] {
    padding: 0;
    height: 30px;
    position: relative;
    left: 0;
    outline: none;
    border: 1px solid #cdcdcd;
    border-color: rgba(0,0,0,.15);
    background-color: white;
    font-size: 16px;
}
.advancedSearchTextbox {
    width: 526px;
    margin-right: -4px;
}

</style>
<script>
    function visitPage(){
        window.location='http://www.example.com';
    }
</script>
</head>
<body bgcolor=#F0E0B2>
<br></br>
<body>
<body>

   <jsp:include page="UserManagement.jsp" />
 
 
 <%
 EmpPojo Emp=new EmpPojo();
 ArrayList<EmpPojo> list= (ArrayList<EmpPojo>)session.getAttribute("list");
 
 //out.println(list);
 %>    
  <%--   <%  
    
    EmpPojo Emp=new EmpPojo();
%> --%>
   <h3>search the user</h3>
    <div style="color:red">
    <html:errors />
    </div>
	<html:form action="/Search" method="post">
	
        Enter UserName:
		<html:text property="userName" size="30" styleClass="advancedSearchTextBox" /><br>
		<%-- Enter your password:
		<html:text property="password" size="30" /><br> --%>
		<html:submit>Search user</html:submit>
		<br><br>
	</html:form>


 <table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>		
    <th>Username</th>
    <th>Password</th>
    <th>Email</th>
    <th>Phone</th>
  </tr>
  
    <logic:iterate id="listId" name="list"  >
    <tr>
    
    <td><bean:write name="listId" property="firstName"/></td>
    <td><bean:write name="listId" property="lastName"/></td>
    <td><bean:write name="listId" property="userName"/></td>
    <td><bean:write name="listId" property="password"/></td>
    <td><bean:write name="listId" property="email"/></td>
    <td><bean:write name="listId" property="phone"/></td>
 <!--  <td>  <form action="/StrutsDBExample/WebContent/Delete.jsp">
    <button type="submit">delete</button>
    </form>
    </td> -->
    </tr>
    </logic:iterate>
  
</table>


<%--  <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            
            <c:forEach var="Emp" items="${list.rows}">
                <tr>
                    <td><c:out value="${Emp.getUserName()}" /></td>
                    //<td><c:out value="${emp.name}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
    </div> --%>

<%-- firstName : <%=session.getAttribute("firstName") %><br><br>
lastName : <%=session.getAttribute("lastName") %><br><br>
userName : <%=session.getAttribute("userName") %><br><br>
password :<%=session.getAttribute("passWord") %><br><br>
email : <%=session.getAttribute("email") %><br><br>
phone : <%=session.getAttribute("phone") %><br><br>

     --%>
     <!-- <a href="exportUser.jsp" >Excel</a> -->
</body>
</html>