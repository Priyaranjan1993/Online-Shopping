<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
<link rel="Stylesheet" href="css/Style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model Driven Action Demo</title>
</head>
<body>
<div id="header">
			<h2>Add new Discount</h2>
		</div>
	
	<s:actionerror cssStyle="color:red" />
	<s:form cssStyle="align:center;" action="discountRegister">
		<s:textfield label="discount Name" name="discountName" required="true" />
		<s:textfield label="discountPercentage" name="discountPercentage" required="true" />
		<s:textfield label="discountStartDate" name="discountStartDate" required="true" />
		<s:textfield label="validity" name="validityPeriod" required="true" />
		<s:textfield label="discountEndDate" name="discountEndDate" required="true" />
		<s:submit label="Submit" />
		<s:reset label="Reset" />
	</s:form>

</body>
</html>