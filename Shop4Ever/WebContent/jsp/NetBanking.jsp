<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NET BANKING FORM</title>
</head>
<body>
<s:form action="netbanking">
<fieldset>
<label>NET BANKING</label>
<table>
<tr>
<td>
	<s:textfield label="Account Number" name="accountNumber"></s:textfield>
</td>
</tr>

	<tr>
	<s:checkbox label="Confirm" name="agree" fieldValue="true"></s:checkbox>
	</tr>
<tr>
<td>
	<s:textfield label="Transaction Password" name="transactionPassword"></s:textfield>
</td>
</tr>

<tr>
	<s:submit value="SUBMIT" align="center"></s:submit><s:reset value="RESET" align="center"></s:reset>
	</tr>
	
</table>
</fieldset>
</s:form>
</body>
</html>