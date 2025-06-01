<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Controle de Sessão</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<c:choose>
		  <c:when test="${sessionScope.user_name == null}">
		    <h1>Insira um nome para seu usuário</h1>
			<form action="session" method="POST">
		        <label for="username">Nome de usuário:</label>
		        <input type="text" id="username" name="username" required>
		        <button type="submit">Iniciar Sessão</button>
	    	</form>
		  </c:when>
		  <c:otherwise>
				<h1>Bem vindo de volta, ${sessionScope.user_name}!</h1>
		  </c:otherwise>
		</c:choose>
		<button onclick="window.location.href='/atividade2/'">Início</button>
	</body>
</html>