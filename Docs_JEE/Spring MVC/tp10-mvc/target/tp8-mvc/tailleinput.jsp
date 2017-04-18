<!-- tailleinput.jsp --> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculateur de Poids idéal : Poids idéal Masculin (en Kg) = Taille (en cm) - 100 - ((Taille (en cm) - 150) /4 ). </title>
</head>
<body>
DETERMINEZ VOTRE POIDS IDEAL.<br>
Poids idéal Masculin (en Kg) = Taille (en cm) - 100 - ((Taille (en cm) - 150) /4 ).
<hr />
<form method="POST" action="${pageContext.request.contextPath}/Calculateur">  
Votre Taille en Centimètres: <input type="text" size="20" name="taille" /> <br />
<input type="submit" value="CalculerPoids" />
</form>
<hr />
</body>
</html>
