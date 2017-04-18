<!-- poidsoutput.jsp --> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Résultat du calcul du poids théorique : </title>
</head>
<body>

<p>Vous avez demandé le calcul de votre poids idéal, en fonction de votre taille : ${requestScope.personne.taille}</p>
<p>
<b>Et le résultat est: ${requestScope.personne.poids}  Kg </b>!
</p>
</body>
</html>
