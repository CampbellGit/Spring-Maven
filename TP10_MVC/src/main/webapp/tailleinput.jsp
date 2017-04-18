<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Taille input</title>
</head>
<body>
<p>Veullez indiquer votre taille</p>
<form method="post" action="<c:url value='/Calculateur'/>">
<input id="taille" name="taille" value="taille" />
<input type="submit" value="Valider"  />
</form>
</body>
</html>