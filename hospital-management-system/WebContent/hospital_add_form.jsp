<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Patient Form</title>
</head>
<body>
	<spr:form action="hospital_add.htm" method="post" commandName="hospital" >
	<table align="center" >
		<tr>
			<td>
				Patient :
			</td>
			<td>
				<spr:input path="patientName"/>
			</td>
		</tr>
		<tr>
			<td>
				Contact No.:
			</td>
			<td>
				<spr:input path="contactno"/>
			</td>
		</tr>
		<tr>
			<td>
				Admit Date:
			</td>
			<td>
				<spr:input path="admitDate"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Add" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>