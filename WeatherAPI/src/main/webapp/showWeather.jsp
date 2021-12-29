<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.weatherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The weather</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<section>

	<%
	weatherBean wBean = (weatherBean) request.getAttribute("wBean");
	out.print("City: " + wBean.getCityStr() + "<br>");
	out.print("Country: " + wBean.getCountryStr() + "<br>");
	out.print("Temperature: " + wBean.getTemperatureCelsius() + "C <br>");
	out.print("Cloud status: " + wBean.getCloudsStr() + "<br>");
	out.print("Last updated: " + wBean.getDateStr());
	%>

</section>

</body>
</html>