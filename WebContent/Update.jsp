<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<html:html>

<jsp:include page="UserManagement.jsp" />
<br/>
   <h3>find the user</h3>
    <div style="color:red">
    <html:errors />
    </div>
	<html:form action="/Update" method="post">
	
        Enter your username:
		<html:text property="userName" size="30" /><br><br>
		<%-- Enter your password:
		<html:text property="password" size="30" /><br><br> --%>
		<html:submit>verify user</html:submit>
		<br><br>
	</html:form>
</html:html>
</body>
</html>