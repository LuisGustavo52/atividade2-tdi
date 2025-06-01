<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Métodos HTTP suportados</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<h1>Métodos HTTP suportados</h1>
		<p>Para acessar o servlet de métodos, use um agente de usuário que lhe permita fazer uma 
		requisição HTTP com o método OPTIONS no seguinte endereço: <b>${pageContext.request.contextPath}/methods</b></p>
		<br>
		<button onclick="window.location.href='/atividade2/'">Início</button>
	</body>
</html>