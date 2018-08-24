<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>

<style type="text/css">
.errorMessage{color:red;} 
</style>
</head>
<body>

<div>
<center>
<s:actionerror cssStyle="color:red"/>


<s:form action="home" name="LoginPage">

<table>
<tr><td><s:textfield label="UserId" name="customerId"></s:textfield></td></tr>
<tr><td><s:password label="Password" name="password"></s:password></td></tr>
<tr><td align="center"><s:submit value="Login"></s:submit></td></tr>


</table>



</s:form>
</center></div>



</body>
</html>