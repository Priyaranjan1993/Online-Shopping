<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make Payment</title>
</head>
<body bgcolor="Lightyellow">
<center><h2><font color="green">Please fill the following details</font></h2></center>

<s:form name="RegistrationForm" action="customerRegister">

<table  border="1" align="center">
<tr>
	<td>Product Details</td>
	<td><s:property value="userName"/></td> 
	</tr>
	</table>
	
	<fieldset>
	  <label>Billing Address</label>
	  <table  border="1" align="center">
<tr>
		<td><s:textfield label="House Number" name="houseNumber"></s:textfield></td></tr>
		
<tr>	<td><s:textfield label="Street Name" name="streetName" ></s:textfield></td></tr>
<tr>
	<td><s:textfield label="Land Mark" name="landMark"></s:textfield></td>
	
	</tr>
<tr>
	<s:select label="City" list="{'MUMBAI','DELHI','CHENNAI','BANGALORE','KOLKATA'}" headerKey="---Select---" headerValue="---Select---" name="city">
	</s:select>
	</tr>

			</table>
	</fieldset>
<fieldset>
	<label>Delivery Address</label>
	  <table  border="1" align="center">
<tr>
		<td><s:textfield label="House Number" name="houseNumber"></s:textfield></td></tr>
		
<tr>	<td><s:textfield label="Street Name" name="streetName"></s:textfield></td></tr>
<tr>
	<td><s:textfield label="Land Mark" name="landMark"></s:textfield></td>
	
	</tr>
<tr>
	<s:select label="City" list="{'MUMBAI','DELHI','CHENNAI','BANGALORE','KOLKATA'}" headerKey="---Select---" headerValue="---Select---" name="city">
	</s:select>
	</tr>

			</table>
	</fieldset>
	
	<table  border="1" align="center">
	<tr>
	<td>MRP Amount</td>
	<td><s:property value="mrpAmount" /></td> 
	</tr>
	<tr>
	<td>Discount</td>
	<td><s:property value="discount" /></td> 
	</tr>
	<tr>
	<td>Debate Amount</td>
	<td><s:property value="debateAmount" /></td> 
	</tr>
	<tr>
	<td>Tax</td>
	<td><s:property value="tax" /></td> 
	</tr>
	<tr>
	<td>Final Amount</td>
	<td><s:property value="finalAmount" /></td> 
	</tr>
	
	<tr>
	<s:radio label="Payment Mode" list="{'Net Banking','Credit Card'}" name="paymentMode"></s:radio>
	</tr>
	
	
	<tr>
	<s:submit value="REGISTER" align="center"></s:submit><s:reset value="RESET" align="center"></s:reset>
	</tr>
	</table>
		
</s:form>

</body>
</html>