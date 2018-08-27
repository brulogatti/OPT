<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Funcionários</title>
</head>
<body>

<h1>Cadastro de Funcionários</h1>

<form action = "FuncionarioCtrl" method="post">

<table style="width:100%">
  <tr>
    <td>Id:</td>
    <td><input type="text" name="id" /></td>
  </tr>
  <tr>
    <td>Nome:</td>
    <td><input type="text" name="nome" /></td>
  </tr>
  <tr>
    <td>Telefone:</td>
    <td><input type="text" name="telefone" /></td>
  </tr>
</table>
<br>
<input type="submit" value="Salvar"/>

</form>

<% if (request.getAttribute("msg") != null){ %>
<b>	<%=request.getAttribute("msg") %> </b>
<%} %>
</body>
</html>