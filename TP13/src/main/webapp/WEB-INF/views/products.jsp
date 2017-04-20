<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type='text/css' href="<%=request.getContextPath() %>/resources/css/style.css">
<title>Catalogue produit</title>
</head>
<body>

	<div id="formProducts">
		<f:form modelAttribute="product" method="post" action="saveProduct">
		<table>
			<tr><th>Référence</th><td><f:input path="ref" /></td></tr>
			<tr><th>Nom</th><td><f:input path="nom" /></td></tr>
			<tr><th>Prix</th><td><f:input path="price" /></td></tr>
			<tr><th>Quantité</th><td><f:input path="quantity" /></td></tr>						
			<f:hidden path="id"/>		
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>
		</f:form>
		</div>

	<div id="listProducts">
		<table class="table1">
			<tr><th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th></tr>
			<c:forEach items="#{products}" var="p">
			<tr>
			<td>${p.ref}</td>
			<td>${p.nom}</td>		
			<td>${p.price}</td>		
			<td>${p.quantity}</td>		
			<td><a href="deleteProduct?ref=${p.ref}">Supprimer</a></td>		
			<td><a href="editProduct?ref=${p.ref}">Modifier</a></td>
			</tr>
			</c:forEach>		
		</table>
	
	
	
	
	
	</div>
<!--
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


-->


</body>
</html>