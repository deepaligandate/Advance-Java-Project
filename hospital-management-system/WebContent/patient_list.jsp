<%@page import="com.cdac.dto.Hospital"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	
	<table align="center" >
		<% 
		List<Hospital> hlist = (List<Hospital>)request.getAttribute("hspList");
		for(Hospital hsp : hlist){
		%>
		<tr>
			<td>
				<%=hsp.getpatientName()%>
			</td>
			<td>
				<%=hsp.getcontactno()%>
			</td>
			<td>
				<%=hsp.getadmitDate()%>
			</td>
			<td>
				<a href="hospital_delete.htm?patientId=<%=hsp.getPatientId()%>">Delete</a>
			</td>
			<td>
				<a href="hospital_update_form.htm?patientId=<%=hsp.getPatientId()%>">Update</a>
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	
</body>
</html>