<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Cabeçalhos da Requisição</title>
	<link rel="stylesheet" href="css/style.css">
	</head>
	<body style="text-align:  left;">
	<h1>Cabeçalho da Requisição</h1>
		<c:forEach var="header" items="${headers}">
			<p>${header}</p> 
		</c:forEach>
	<button onclick="window.location.href='/atividade2/'">Início</button>
	</body>
</html>