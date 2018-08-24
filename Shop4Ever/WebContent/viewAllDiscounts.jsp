<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix='s' uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Discount Details</title>
</head>
<body>


<div id="header">
			<h3>All Discount details</h3>
		</div>

			<table border="2">
				<tr>
				    <td>discount Id</td>
					<td>discount Name</td>
					<td>discountPercentage</td>
					<td>discountStartDate</td>
					<td>validity</td>
					<td>discountEndDate</td>
					<td>status</td>
					
				</tr>
				<s:iterator value="discountList">
					<tr>
					    <td><s:property value="discountId"/></td>
						<td><s:property value="discountName"/></td>
						<td><s:property value="discountPercentage"/></td>
						<td><s:property value="discountStartDate"/></td>
						<td><s:property value="validityPeriod"/></td>
						<td><s:property value="discountEndDate"/></td>
                        <td><s:property value="status"/></td>
                        
					</tr>
				</s:iterator>
			</table>



</body>
</html>