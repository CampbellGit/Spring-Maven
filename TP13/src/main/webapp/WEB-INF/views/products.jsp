<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type='text/css' href="<%=request.getContextPath() %>/resources/css/style.css">
<title>Catalogue produit</title>
</head>
<body>

<form method="post" id="menu" action="<c:url value='/Convertisseur'/> ">
<label>Référence : </label><input id="temp" name="temp" /><br>
<label>Désignation : </label><input id="temp" name="temp" /><br>
<label>Prix : </label><input id="temp" name="temp" /><br>
<label>Quantité : </label><input id="temp" name="temp" /><br>

<label><input type="submit" value="Sauvegarder"  /></label><br>
</form>


		<table>
			<tr>
				<td>REF</td>
				<td>DESIGNATION</td>
				<td>PRIX</td>
				<td>QUANTITE</td>
			</tr>
			<tr>
				<td>AT980</td>
				<td>Smartphone GT</td>
				<td>4500.00</td>
				<td>8</td>
				<td><a href="www">Supprimer</a></td>
				<td><a href="www">MàJ</a></td>
			</tr>
			<tr>
				<td>HP675</td>
				<td>Ordinateur HP</td>
				<td>8000.00</td>
				<td>5</td>
				<td><a href="www">Supprimer</a></td>
				<td><a href="www">MàJ</a></td>
			</tr>
			<tr>
				<td>AERT</td>
				<td>Test</td>
				<td>2450.0</td>
				<td>23</td>
				<td><a href="www">Supprimer</a></td>
				<td><a href="www">MàJ</a></td>
			</tr>
			<tr>
				<td>aaaaaaaaaa</td>
				<td>bbbbbbbbbbb</td>
				<td>900.0</td>
				<td>67</td>
				<td><a href="www">Supprimer</a></td>
				<td><a href="www">MàJ</a></td>
			</tr>
			<tr>

			</tr>
		</table>





</body>
</html>