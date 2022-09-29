<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
if (session.getAttribute("empId") == null) {
	response.sendRedirect("Login.jsp");
} else {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../Style.css">
<title>Animal Details</title>
</head>
<body>
	<img src="../Resources/velociterlogo.png" />
	<form action="AnimalRegistrationServlet" method="post">
		<table align="center">
			<tr>
				<td>Animal Name:</td>
				<td><input type="text"
					oninput="value=value.replace(/[^a-zA-Z ]/g,'')" name="AnimalName"
					required="required"></td>
			</tr>
			<tr>
				<td>Animal Type:</td>
				<td><input type="radio" value="Domestic" name="AnimalType" checked="checked"
					required="required">Domestic <input type="radio"
					value="Wild" name="AnimalType">Wild</td>
			</tr>
			<tr>
				<td>Animal Breed:</td>
				<td><input type="text"
					oninput="value=value.replace(/[^a-zA-Z ]/g,'')" name="AnimalBreed"
					required="required"></td>
			</tr>
			<tr>
				<td>Animal Weight:</td>
				<td><input type="text"
					oninput="value=value.replace(/[^0-9 ]/g,'')" name="AnimalWeight"
					oninput="" required="required"></td><td>Kgs</td>
			</tr>
			<tr>
				<td>Animal Height:</td>
				<td><input type="text"
					oninput="value=value.replace(/[^0-9 ]/g,'')" name="AnimalHeight"
					required="required"></td><td>Feet</td>
			</tr>
			<tr>
				<td>Animal Leg Count:</td>
				<td><select name="AnimalLegs" required="required">
						<option value="2">Two</option>
						<option value="4">Four</option>
				</select></td>
			</tr>
			<tr>
				<td>Animal Reproduction Type:</td>
				<td><select name="AnimalReproduct" required="required">
						<option value="Oviporus">Oviporus(Eggs)</option>
						<option value="Viviporus">Viviporus(Younger version)</option>
				</select></td>
			</tr>
			<tr>
				<td>Animal Food:</td>
				<td><input type="text"
					oninput="value=value.replace(/[^a-zA-Z ]/g,'')" name="AnimalFood"
					required="required"></td>
			</tr>
			<tr>
				<td>Animal Diet:</td>
				<td><select name="AnimalDiet" required="required">
						<option value="Vegetarian">Vegetarian</option>
						<option value="Non Vegetarian">Non-Vegetarian</option>
				</select></td>
			</tr>
			<tr>
				<td>Animal LifeSpan:</td>
				<td><input type="text"
					oninput="value=value.replace(/[^0-9 ]/g,'')" name="AnimalLife"
					required="required"></td><td>Months</td>
			</tr>
			<tr>
				<td>Animal Place:</td>
				<td><input type="text" name="AnimalPlace" required="required"></td>
			</tr>
			<tr>
				<td>Animal Benifits:</td>
				<td><input type="text" name="AnimalBenifits"
					required="required"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save Animal Details"> <input type="reset"
					value="Clear"></td>
			</tr>
		</table>
	</form>
	<a href="Welcome.jsp">Welcome page</a>
</body>
</html>
<%
}
%>