<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix='s' uri="/struts-tags" %>
<html>
<head>
<link rel="Stylesheet" href="css/Style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Discounts</title>
</head>
<body>


<div id="header">
			<h3>Discount detail</h3>
</div>

			<table border="2">
				<tr>
				    <td>discount Id</td>
					<td>discount Name</td>
					<td>discountPercentage</td>
					<td>discountStartDate</td>
					<td>validity</td>
					<td>discountEndDate</td>
					<td>Status</td>
				</tr>
				<s:iterator value="discountList">
					<tr>
					    <td><s:property value="discountId"/></td>
						<td><s:property value="discountName"/></td>
						<td><s:property value="discountPercentage"/></td>
						<td><s:property value="discountStartDate"/></td>
						<td><s:property value="validity"/></td>
						<td><s:property value="discountEndDate"/></td>
						<td> <s:url var="update" action="update" namespace="/">
						     <s:param name="discountId" value="%{discountId}"></s:param> </s:url>
						     <s:a href="%{#update}">Approve</s:a>
						     &nbsp;
						     <s:url var="reject" action="reject" namespace="/">
						     <s:param name="discountId" value="%{discountId}"></s:param></s:url> 
						     <s:a href="%{#reject}">reject</s:a>  
                       </td>
					</tr>
				</s:iterator>
			</table>
</body>
</html>