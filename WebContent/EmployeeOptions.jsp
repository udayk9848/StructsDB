<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<html>
<head>
<script src="script.js">
</script>
<style>

body{
 font-family:Tahoma, Geneva, sans-serif;
 }
a:link {
    color: green;
    background-color: transparent;
    text-decoration: none;
}
a:visited {
    color: purple;
    background-color: transparent;
    text-decoration: none;
}
a:hover {
    color: red;
    background-color: transparent;
    text-decoration: underline;
}
a:active {
    color: yellow;
    background-color: transparent;
    text-decoration: underline;
}

ul#menu {
    padding: 0;
}

ul#menu li {
    display: inline;
}

ul#menu li a {
    background-color: black;
    color: white;
    padding: 10px 20px;
    text-decoration: none;
    border-radius: 4px 4px 0 0;
}

ul#menu li a:hover {
    background-color: orange;
}
ul#menu li a:active {
    background-color: green;
    color: red;
    padding: 10px 20px;
    text-decoration: bold;
    border-radius: 3px 3px 0 0;
}
ul#menu li a#topright {
    position: absolute;
    right: 15px;
    top: 95px;
    /* font-size:14px;
	color:#FFF;
	text-align:center;
	background-color:#3B5998;
	padding:10px;
	margin-top:10px;
	cursor: pointer;
    
    height: 50px;
    width: 50px;
    background: url(TRbanner.gif) ;
    text-indent: -999em;
    text-decoration: none;  */
} 
</style>
</head>
<body bgcolor=#F0E0B2>
<br></br>
<body>
<body>
	<form action="/Employee" method="post">
	
<ul id="menu">

		

		<li><html:link href="Employee.do?parameter=update">Update User  </html:link></li>

		
		
		<li class=topright><html:link href="Employee.do?parameter=logout">logout</html:link></li>

</ul>
	
	</form>
	
	<%-- <form action="/Logout" >
	<div>
        <html:submit value="Logout" styleId="topright"/>
        </div>
 </form>
 	 --%>
</body>
</html>