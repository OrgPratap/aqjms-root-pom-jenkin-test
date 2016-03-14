<%@page import="java.util.Date"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<center>
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
<div id="producer">
	<form action="producer.hmt" method="post">
		<table>
			<th>
				<td colspan="2">AUTOMOBILE</td>
			</th>
			<tr>
				<td>PNAME(Product Name) :</td>
				<td><input id="pName" type="text" value="404PName"></td>
			</tr>
			<tr>
				<td>MFDATE(Manufacture Date) :</td>
				<td><input id="mfDate" type="text" value="<%= new Date().toString() %>"></td>
			</tr>
			<tr>
				<td>MFCOST(Manufacture Cost) :</td>
				<td>Rs. <input id="mfDate" type="text" value="<%=0 %>"></td>
			</tr>
			<tr>
				<td>Enter Quantity :</td>
				<td><input id="mfQuantity" type="text" value="1"></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="Launch"></td>
			</tr>
		</table>
	</form>
</div>
<hr color="yellow">
<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
</center>
</body>
</html>