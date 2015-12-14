<%@page contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>

<html>
<head>
<title>User Details</title>
</head>
<body>
<table >
    <tr>
    <th>Firstname</th>
    <th>Lastname</th>		
    <th>Username</th>
    <th>Password</th>
    <th>Email</th>
    <th>Phone</th>
  </tr>
    <logic:iterate id="listId" name="list" >
    <tr>
    <td><bean:write name="listId" property="firstName"/></td>
    <td><bean:write name="listId" property="lastName"/></td>
    <td><bean:write name="listId" property="userName"/></td>
    <td><bean:write name="listId" property="password"/></td>
    <td><bean:write name="listId" property="email"/></td>
    <td><bean:write name="listId" property="phone"/></td>
    </tr>
    </logic:iterate>
</table>
</body>
</html>