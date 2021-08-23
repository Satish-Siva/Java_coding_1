<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION FORM</title>
</head>
<body>
<h1>EMPLOYEE REGISTRATION</h1>

<f:form action="save"  modelAttribute="stu"  method="get"  >

First name : <f:input path="firstname"/><br>
Last name : <f:input path="lastname"/><br>
Salary : <f:input path="salary"/><br>
Designation : <f:input path="designation"/><br>

<input type="submit"/>
</f:form>

</body>
</html>