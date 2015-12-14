<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style type="text/css">
#topright {
    position: absolute;
    right: 15px;
    top: 95px;
    font-size:14px;
	color:#FFF;
	text-align:center;
	background-color:#3B5998;
	padding:10px;
	margin-top:10px;
	cursor: pointer;
    
    /*height: 50px;
    width: 50px;
    background: url(TRbanner.gif) ;
    text-indent: -999em;
    text-decoration: none; */
}
</style>
</head>


<body >
<%-- <jsp:include page="UserManagement.jsp" /> --%>
<%-- <form action="/LogoutAction" >
	<div>
	
        <html:submit value="Logout" styleId="topright"/>
        </div> --%>
        <form action="/user" method="post">
 </form>
 	<html:link href="user.do?parameter=logout">logout</html:link>
 </form>
</body>
</html>
