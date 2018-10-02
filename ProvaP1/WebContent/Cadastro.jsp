<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Nomes</title>
</head>
<body>

<h1>Cadastro de Nomes</h1>

<form action = "NomeCrtl" method="post">

<table style="width:100%">
  <tr>
    <td>ID:</td>
    <td><input type="number" name="id" /></td>
  </tr>
  <tr>
    <td>Nome:</td>
    <td><input type="text" name="nome" /></td>
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