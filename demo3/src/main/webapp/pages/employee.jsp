<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="r" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>EMPLOYEE REGISTRATIOON DETAILS</h1>

<r:form  

 action="save"   modelAttribute="employee"   method="post"> 

name : <r:input path="name" type="text"></r:input><br>

Dob :<r:input path=" Dob" type="date"></r:input><br>

gender :<r:input path="gender " type="radio" name="sex">male </r:input><br>
        <r:input  path="gender " type="radio" name="sex">female</r:input> <br>
        <r:input path="gender " type="radio" name="sex">others</r:input><br>

martialstatus :<r:input path="martialstatus" type="radio" name="martialstatus">married</r:input><br>
                <r:input path="martialstatus" type="radio" name="martialstatus">unmarried</r:input><br>
                
address :<r:input path="address" type="textarea"></r:input><br>

mobileno :<r:input path="mobileno"  type="number"></r:input><br>

graduation:<r:input path="graduation" type="checkbox"  name="10thmark">SSC</r:input><br>
            <r:input path="graduation" type="checkbox" name="12thmark">HSC</r:input><br>
            <r:input path="graduation" type="checkbox" name="BEmark">BE</r:input><br>
            <r:input path="graduation" type="checkbox" name="others">OTHERS</r:input><br>
            
skills :<r:input path="skills" type="text"></r:input><br>

certificate:<r:input path=" certicate" type="file"></r:input><br>


<br colspan="2" align="center"><input type ="submit" value="Submit"/input></br>
         





<input type="submit" value="save">


</r:form>






</body>
</html>