<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Pessoa</title>
</head>
<body>

<h1>Cadastro de Pessoa</h1>

<form action = "PessoaCtrl" method="post">

<table style="width:100%">
  <tr>
    <td>Tipo de Pessoa:*</td>
    <td>
    <input type="radio" name="pessoa" value="fisica"> Física
  <input type="radio" name="pessoa" value="juridica"> Jurídica </td>
  </tr>
  <tr>
    <td>CNPJ/CPF:*</td>
    <td><input type="text" name="cpfcnpj" /></td>
  </tr>
  <tr>
    <td>Nome:*</td>
    <td><input type="text" name="nome" /></td>
  </tr>
  <tr>
    <td>Dt. Nascimento:*</td>
    <td><input type="text" name="dtnasc" /></td>
  </tr>
  <tr>
    <td>Endereço:*</td>
    <td><input type="text" name="endereco" /></td>
  </tr>
  <tr>
    <td>Complemento:</td>
    <td><input type="text" name="complemento" /></td>
  </tr>
  <tr>
    <td>Cidade:*</td>
    <td><input type="text" name="cidade" /></td>
  </tr>
  <tr>
    <td>Estado:*</td>
   <td><select name="estado">
  <option value="Acre">AC</option>
  <option value="Alagoas">AL</option>
  <option value="Amapa">AP</option>
  <option value="Amazonas">AM</option>
  <option value="Bahia">BA</option>
  <option value="Ceara">CE</option>
  <option value="Distrito Federal">DF</option>
  <option value="Espirito Santo">ES</option>
  <option value="Goias">GO</option>
  <option value="Maranhão">MA</option>
  <option value="Mato Grosso">MT</option>
  <option value="Mato Grosso do Sul">MS</option>
  <option value="Minas Gerais">MG</option>
  <option value="Para">PA</option>
  <option value="Paraiba">PB</option>
  <option value="Parana">PR</option>
  <option value="Pernambuco">PE</option>
  <option value="Piaui">PI</option>
  <option value="Rio de Janeiro">RJ</option>
  <option value="Rio Grande do Norte">RN</option>
  <option value="Rio Grande do Sul">RS</option>
  <option value="Rondonia">RO</option>
  <option value="Roraima">RR</option>
  <option value="Santa Catarina">SC</option>
  <option value="São Paulo">SP</option>
  <option value="Sergipe">SE</option>
  <option value="Tocantins">TO</option>
</select></td>
  </tr>
  <tr>
    <td>CEP:*</td>
    <td><input type="text" name="cep" /></td>
  </tr>
  <tr>
    <td>e-mail:*</td>
    <td><input type="text" name="email" /></td>
  </tr>
   <tr>
    <td>confirme o e-mail:*</td>
    <td><input type="text" name="confemail" /></td>
  </tr>
   <tr>
    <td>Senha:*</td>
    <td><input type="text" name="senha" /></td>
  </tr>
</table>
<br>
<input type="submit" value="Salvar"/>

</form>


</body>
</html>