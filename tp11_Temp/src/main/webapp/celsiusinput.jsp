<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Temp input</title>
</head>
<body>
<p>Veullez indiquer la température en celsius</p>
<form method="post" action="<c:url value='/Convertisseur'/>">
<input id="temp" name="temp" />
<input type="submit" value="Valider"  />
</form>
</body>
</html>