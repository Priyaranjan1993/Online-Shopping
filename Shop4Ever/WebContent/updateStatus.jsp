<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FFFFF0">

	<h3>update order details</h3>
 
 
	<s:form action="updateStatus" theme="simple">
	 <s:iterator value="orderlist">
		<table border="1">

			
				<tr><td>order Id</td><td><s:property value="orderId"/></td></tr>
				<tr><td>product details</td><td><s:property value="productDetails" /></td></tr>
				<tr><td>billing address</td><td><s:property value="billingAddress" /></td></tr>
				<tr><td>delivery address</td><td><s:property value="deliveryAddress" /></td></tr>
				<tr><td>amount to pay</td><td><s:property value="mrpAmount" /></td></tr>
				<tr><td>discount details</td><td><s:property value="discountAmount" /></td></tr>
				<tr><td>tax</td><td><s:property value="tax" /></td></tr>
				<tr><td>final amount to pay</td><td><s:property value="finalAmount" /></td></tr>
			<tr><td>Order Status</td><td><s:select list="{'SHIPPING_IN_PROGRESS','COD_PAYMENT_PENDING','PAYMENT_DONE','DELIVERED'}" name="orderStatus" 
		 headerKey ="orderstatus" headerValue ="orderstatus" scope="session"></s:select></td></tr>
		</table>
		</s:iterator>
		<br><br>
		<s:submit value="Update Status"/>
	</s:form>
</body>
</html>