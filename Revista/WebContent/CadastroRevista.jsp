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

<form action = "RevistaCtrl" method="post">

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
<br>

<input type="submit" value="Verificar"/>

<%
    int ano = Integer.parseInt(request.getParameter("ano"));
	String nome = request.getParameter("nome");
    int qtdpg = Integer.parseInt(request.getParameter("qtdpg"));
%>
<%
	if (ano<=2018 && nome.length()>7 && qtdpg>20 ){
		%>
		<input type="submit" value="Salvar"/>
		<%
	}else
	{
		%>
		<h3>Dados incorretos: Ano posterior a 
		2018 ou Nome muito curto ou Revista muito pequena (menor que 20 pg)</h3>
		<% 
	}
%>



</form>

<% if (request.getAttribute("msg") != null){ %>
<b>	<%=request.getAttribute("msg") %> </b>
<%} %>

</body>
</html>