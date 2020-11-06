<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Hospital Form</title>
</head>
<body>
<h2>Update Your Patient Information Here</h2>
	<spr:form action="hospital_update.htm" method="post" commandName="hospital" >
	<table align="center" >
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="patientId"/>
			</td>
		</tr>
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
				<a href="patient_list.htm" >Back</a>
			</td>
			<td>
				<input type="submit" value="Update" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>