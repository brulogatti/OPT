<%@page import="br.com.revista.dados.RevistaBD"%>
<%@page import="br.com.revista.entidade.Revista"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightgray">

	<h1>Cadastro de Revistas</h1>

	<form action="RevistaCtrl" method="post">

		<table style="width: 100%">
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Ano:</td>
				<td><input type="text" name="ano" /></td>
			</tr>
			<tr>
				<td>Mês:</td>
				<td><input type="text" name="mes" /></td>
			</tr>
			<tr>
				<td>Quantidade de páginas:</td>
				<td><input type="text" name="qtdpg" /></td>
			</tr>
		</table>
		<br> <input type="submit" value="Salvar" />


	</form>
	
	<h1>Consultar Revista</h1>
	
	<form action="ConsultaRevista.jsp" method="post">

		<table style="width: 100%">
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="idconsulta" /></td>
			</tr>
		</table>
		<br> <input type="submit" value="Consultar" />


	</form>
	
	
		<h1 align="center">Lista de Revistas</h1>
	<div>
<table class="table table-hover table-dark" width="400px" align="center">
  <thead>
    <tr>
      <th scope="col">Código</th>
      <th scope="col">Nome</th>
      <th scope="col">Ano</th>
      <th scope="col">Mês</th>
      <th scope="col">Quantidade de Páginas</th>
    </tr>
  </thead>
  <tbody>
    
    <% for(Revista revista : new RevistaBD().getAll()){ %>
    
    <tr>
      <td width="400px" align="center"><%=revista.getId()%></td>
      <td width="400px" align="center"><%=revista.getNome() %></td>
      <td width="400px" align="center"><%=revista.getAno() %></td>
      <td width="400px" align="center"><%=revista.getMes()%></td>
      <td width="400px" align="center"><%=revista.getQtdpg()%></td>
    </tr>
    
  <% } %>
    </tbody>
</table>
</div>
</body>
</html>