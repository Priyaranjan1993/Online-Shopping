<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form  action="selectcity">
		<table border="1">

			<tr>
				<td>order Id</td>
				<td>product details</td>
				<td>billing address</td>
				<td>delivery address</td>
				<td>amount to pay</td>
				<td>discount details</td>
				<td>tax</td>
				<td>final amount to pay</td>
				<td>orderStatus</td>
				<td>city</td>
				
			</tr>
			
			<s:iterator value="orderlist">
				<tr>
				<td><s:property value="orderId"/></td>



					<td><s:property value="productDetails" /></td>



					<td><s:property value="billingAddress" /></td>


					<td><s:property value="deliveryAddress" /></td>


					<td><s:property value="mrpAmount" /></td>
					
					<td><s:property value="discountAmount" /></td>
					
					<td><s:property value="tax" /></td>
					<td><s:property value="finalAmount" /></td>
					<td><s:property value="orderStatus" /></td>
					<td><s:property value="deliveryAddressCity" /></td>
					 
				</tr>
			</s:iterator>
			
			</table><br><br>
			Select Id:<s:select list="orderlist" name="orderIdSelected" listKey="orderId" 
		listValue="orderId" headerKey = "Select" headerValue = "Select Id" scope="session"></s:select><br>		
		<br><br>
		Order Status<s:select list="{'CHENNAI','MUMBAI','KOLKATA','DELHI'}" name="city" 
		 headerKey ="select city" headerValue ="select city" scope="session"></s:select>
		<s:submit value="Submit"/>
	</s:form>

</body>
</html>