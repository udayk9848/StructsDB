<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style type="text/css">
#container {
	width: 300px;
	/* background-color:#00CC00; */
	margin: auto;
	margin-top: 150px;
	margin-bottom: 5px;
	box-shadow: 0 0 3px #999;
}

#container_body {
	padding: 20px;
}

body {
	background-image:
		url("http://neowin.s3.amazonaws.com/forum/uploads/monthly_09_2010/post-276844-12834749164609.jpg");
}
</style>
</head>


<body>
	<center>
		<div id="container">
			<div id="container_body">
				<html:form action="/login" focus="userName">
	
						Username<br>
					<html:text property="userName" value="uday" />
					<br>
					<br>		
						Password<br>
					<html:password property="password" value="uday" />
					<br>
					<br>
					<html:submit value="login" />
				</html:form>

			</div>
		</div>
		<%-- <html:html>
    <div style="color:red">
    <html:errors />
    </div>
	<html:form action="/register" method="post">

		Enter your First Name:
		<html:text property="firstName" size="50" /><br><br>
		Enter your Last Name:
		<html:text property="lastName" size="50" /><br><br>
		Enter your username:
		<html:text property="userName" size="50" /><br><br>
		Enter your password:
		<html:text property="password" size="30" /><br><br>
		Enter your Email:
		<html:text property="email" size="30" /><br><br>
		Enter your Phone No:
		<html:text property="phone" size="15" /><br><br>
		<html:submit>Submit</html:submit>
		<br><br>
	</html:form>
</html:html> --%>
	</center>
</body>
</html>
