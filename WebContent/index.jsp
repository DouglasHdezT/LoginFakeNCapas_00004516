<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Verificador de Usuario y contrase�a</h1>
	
	<form action="login" method="post">
		
		<label for="username"> Nombre de usuario:</label>
		<input type="text" name="username">
		
		
		<label for="password"> Contrase�a:</label>
		<input type="password" name="password">
		
		
		<input type="submit" value="Verificar">
			
	</form>
</body>
</html>