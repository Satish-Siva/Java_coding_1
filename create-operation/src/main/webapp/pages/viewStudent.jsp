<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ALL EMPLOYEES</h1>
<table>
<thead>
<th> id</th>
<th> firstname </th>
<th> lastname </th>
<th>  salary</th>
<th> designation </th>
</thead>

<s:forEach items="allStudent" var="stu">
<body>
<tr>

<td>${stu.firstname}</td>
<td>${stu.lastname}</td>
<td>${stu.salary}</td>
<td>${stu.designation}</td>


</tr>
</s:forEach>
</body>
</table>
</body>
</html>