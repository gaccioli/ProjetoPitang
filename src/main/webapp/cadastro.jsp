<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>

<%
@SuppressWarnings("unchecked")
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("usuarios");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cadastro de Usuários</title>
<link rel="icon" href="login.png">
<link rel="stylesheet" href="style.css">
</head>
<body>

	<h1>Cadastro de Usuários</h1>
	<a href="novo.html">Novo Usuário</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Email</th>
				<th>DDD</th>
				<th>Numero</th>
				<th>Tipo</th>
			</tr>
		</thead>
		<tbody>


			<%
			for (int i=0; i < lista.size(); i++) {
			%>

			<tr>
				<td><%=lista.get(i).getId()%></td>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getEmail()%></td>
				<td><%=lista.get(i).getFone_ddd()%></td>
				<td><%=lista.get(i).getFone_numero()%></td>
				<td><%=lista.get(i).getFone_tipo()%></td>


				<td><a href="select?id=<%=l.getId()%>" class="bt_01">Editar</a>
					<a href="javascript: confirmar(<%=l.getId()%>)" class="bt_02">Excluir</a>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>