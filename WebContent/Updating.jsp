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
#container{
	width:550px;
	background-color:rgba(250,250,252,.9); 
	/* color: #ebebeb; */
	margin:auto;
	margin-top:5px;
	margin-bottom:5px;
	box-shadow:10px 10px 3px #999;
	}
#container_body{
	padding:20px;
	}
.form_title{
	font-size:25px;
	color:#141823;
	text-align:center;
	padding:0px;
	font-weight:normal;
	}
.head_para{
	font-size:19px;
	color:#99a2a7;
	text-align:center;
	font-weight:normal;
	}
.head_para1{
	
	font-size:20px;
	color:red;
	
	}
#form_name{
	padding:25px 0 0 15px;
	}
.firstnameorlastname{
	 margin-right:20px;
	}
.input_name{
	width:300px;
	padding:3px;
	text-align:center;
	font-size:20px;
	}


#radio_button{
	padding:10px 0 0 0;
	}
#sign_user{
	font-size:14px;
	color:#FFF;
	text-align:center;
	background-color:#3B5998;
	padding:10px;
	margin-top:10px;
	cursor: pointer;
	}
#errorBox{
	color:#F00;
	}
#email_form{
	clear:both;
	padding:15px 0 10px 0px;
	}


</style>
</head>
<body bgcolor=#F0E0B2>
<br></br>
<body>
<body>

   <jsp:include page="UserManagement.jsp" />
  <br>
  <html:form action="/Updating" method="post">
    <div id="container">
  <div id="container_body">
   <p class="head_para1" >
    <html:errors />
    </p>
    <div>
      <h2 class="form_title">Update Employee information </h2>
      <p class="head_para">enter employee details </p>
    </div>
    <!--Form  start-->
    <div id="form_name">
      
       
		       <div id="errorBox"></div>
		       <table>
		       <tr>
		       
		       <td>
		       <p class="head_para1" >
		        FirstName</p>
		        </td>
		        <td>
		        <input type="text" name="firstName" value="<%=session.getAttribute("firstName") %>"   class="input_name" >
		       </td>
		        </tr>
		        
		        <tr>
		       
		       <td>
		       <p class="head_para1" >LastName</p>
		        </td>
		        <td>
		        <input type="text" name="lastName" value="<%=session.getAttribute("lastName") %>"  class="input_name" >
		        </td>
		        </tr>
		      
		      <tr>
		       
		       <td>
		       <p class="head_para1" >userName</p>
		        </td>
		        <td>
		        
		        <input type="text" name="userName" value="<%=session.getAttribute("userName") %>"   class="input_name">
		        </td>
		        </tr>
		      
		      <tr>
		       
		       <td>
		       <p class="head_para1" >Password</p>
		        </td>
		        <td>
		      
		        <input type="text" name="password" value="<%=session.getAttribute("passWord") %>"   class="input_name">
		       </td>
		        </tr>
		     <tr>
		     <td>
		     <p class="head_para1" >
		      Email</p>
		        </td>
		        <td>
		        <input type="text" name="email" value=" <%=session.getAttribute("email") %>"   class="input_name">
		        </td>
		      </tr>
		      
		     
		        
		      <tr>
		     <td>
		     <p class="head_para1" >Phone</p>
		        </td>
		        <td>
		        
		        <input type="text" name="phone" value=" <%=session.getAttribute("phone") %>"   class="input_name">
		          </td>
		      </tr>
		        <input type="hidden" name="ouserName" value="ouserName" />
		         <input type="hidden" name="oPassword" value="oPassword" />
		        </table>
		      </div>
		        <center>
		        <input id="sign_user" type="submit" value="UPDATE EMPLOYEE">
		        </center>
		      </div>
     
    </div>
    <!--form ends--> 
    
  
 <% 
		        String ouserName = session.getAttribute("userName").toString();
		        /* String oPassword = session.getAttribute("passWord").toString(); */
		        //out.println(ouserName+"  "+oPassword);
		       session.setAttribute("ouserName",ouserName);
		        %>
</html:form>
</body>
</html>