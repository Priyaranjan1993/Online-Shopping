<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form theme="simple" action="payment1" name="paymentform1">
<center>
	<h1>Please fill following details</h1>
	<%String orderid=request.getParameter("orderId"); %>
	<table border="1">	
	<tr>
		<td><s:label value="OrderId:"/></td>
		<td><s:property value=orderId/></td>
	</tr>
	
	
	<tr>
		<td><s:label value="Payment Mode:"/></td>
		<td><s:radio name="paymentMode" list="{'Online','Cash on delivery'}"/></td>
	</tr>
	<tr>
		<td colspan='2' align='center'><s:submit value="proceed"></s:submit></td>
	</tr>

	</table>
	
</center>
</s:form>

</center>




</body>
</html>