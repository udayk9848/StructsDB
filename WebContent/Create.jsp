<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style type="text/css">

body{
 font-family:Tahoma, Geneva, sans-serif;
 }

#container{
 width:550px;
 background-color:rgba(250,250,252,.9);
 margin:auto;
 margin-top:10px;
 margin-bottom:10px;
 box-shadow:0 0 3px #999;
 }
#container_body{
 padding:20px;
 }
.form_title{
 font-size:25px;
 color:#green;
 text-align:center;
 padding:0px;
 font-weight:normal;
 }
.head_para{
	font-size:19px;
	color:#Red;
	font-color:#Red;
	text-align:center;
	font-weight:normal;
	}
#form_name{
	padding:0px 0 0 0px;
	}
		}
.input_name{
	width:207px;
	padding:5px;
	font-size:18px;
	}
	#email_form{
	clear:both;
	padding:15px 0 10px 0px;
	}
.input_email{
	width:434px;
	padding:5px;
	font-size:18px;
	}
#Re_email_form{
	padding:10px 0 10px 0px;
	}
.input_Re_email{
	width:434px;
	padding:5px;
	font-size:18px;
	}
	#errorBox{
	color:#F00;
	}
</style>
<script>
function Submit(){
	var fname = document.getElementById("firstName").value;
	//alert("inside "+fname);
	if(fname == "")
	 {
		alert("enter firstname ");
		 //document.getElementById("errorBox").innerHTML = "enter the password";
	/* return false; */ 
		reload();
	return;
	 }
	else
		{
		//alert("inside else");
		
		}
}
</script>
</head>


<body>
<html:html>

<jsp:include page="UserManagement.jsp" />
<br/>
<div id="container">
  <div id="container_body">
    <div style="color:red">
    <html:errors />
    </div>
    <div>
      <h2 class="form_title">Employee Registration </h2>
      <p class="head_para">Enter Employee details</p>
    </div>
    <div id="form_name">
	<html:form action="/Create" method="post">
	<%-- <div>
            <html:errors/>
        </div> --%>
   <%--   <%@ include file="UserManagement.jsp" %> --%>
		Enter your First Name:
		<html:text property="firstName" size="30" styleId="firstName" styleClass="input_name"/><br><br>
		Enter your Last Name :
		<html:text property="lastName" size="30" styleClass="input_name"/><br><br>
		Enter your userName :
		<html:text property="userName" size="30" styleClass="input_name"/><br><br>
		Enter your password  :
		<html:text property="password" size="30" styleClass="input_password"/><br><br>
		Enter your Email Add  :
		<html:text property="email" size="30" styleClass="input_name"/> <br><br>
		Enter your Phone No  :
		<html:text property="phone" size="30" styleClass="input_name"/><br><br>
		
		<button onclick="Submit()">Create user</button>
		<br><br>
	</html:form>
	</div>
	</div>
	</div>
	
</html:html>
</body>
</html>