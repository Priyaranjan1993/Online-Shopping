<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form theme="simple" action="assignDE">
		Selected Order Id:
		<s:property value="orderIdSelected"></s:property>
		<br>
					Select Id:<s:select list="employeeList" name="deliveryExecutiveId" listKey="employeeId" 
		listValue="employeeId" headerKey = "Select" headerValue = "Select Id" scope="session"></s:select><br>
		<s:submit value="Assign"/>		
	</s:form>


</body>
</html>