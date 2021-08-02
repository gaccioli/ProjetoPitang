<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Usuarios - Editar</title>
<link rel="icon" href="img/login.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Usuario</h1>
	<form name="frmContato" action="update">
		<table align="center">
			<tr>
				<td><input type="text" name="id" id="caixa3" readonly
					value="<%out.print(request.getAttribute("id"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="Caixa1"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="email" class="Caixa1"
					value="<%out.print(request.getAttribute("email"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone_ddd" class="Caixa1"
					value="<%out.print(request.getAttribute("fone_ddd"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone_numero" class="Caixa1"
					value="<%out.print(request.getAttribute("fone_numero"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone_tipo" class="Caixa1"
					value="<%out.print(request.getAttribute("fone_tipo"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="senha" class="Caixa1"
					value="<%out.print(request.getAttribute("senha"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="bt_01" onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>
