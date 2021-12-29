<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VäderAPI</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

 <form action="OWservlet" method="get">  
    <h4>City:<input type="text" name="city"><br>  
    Country:<input type="text" name="country"></h4>  
    
    <input type="submit" value="Enter">  
    </form> 
    
    
    <%
    Cookie[] cookies = request.getCookies();
    
    if (cookies != null) {
    	//out.print("<br> Earlier searchs!");
		for (int i = 0; i < cookies.length; i++) {

    	}
    }
    %>


</body>
</html>