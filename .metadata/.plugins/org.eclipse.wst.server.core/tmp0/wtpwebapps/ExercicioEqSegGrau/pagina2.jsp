<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Resolução da Equação</h1>
<h2>Forma Geral:</h2>
${param.a}x²+${param.b}x+${param.c}=0
<br>
<h2>Parâmetros:</h2>
a= ${param.a}
<br>
b= ${param.b}
<br>
c= ${param.c}
<br>
<h2>Valor de Delta</h2>
Delta= ${param.b}²-4*${param.a}*${param.c}
<%
double a = Double.parseDouble(request.getParameter("a"));
double b = Double.parseDouble(request.getParameter("b"));
double c = Double.parseDouble(request.getParameter("c"));
double delta = b*b-4*a*c;
%>
<br>
Delta= <%=delta%>
<br>
<%
if (delta>0){
%>
√Delta= <%=Math.sqrt(delta)%>
<%
}
%>
<h2>Raízes (X1 e X2):</h2>
<%
if(delta>0){
	double x1 = (-b+(Math.sqrt(delta)))/(2*a);
	double x2 = (-b-(Math.sqrt(delta)))/(2*a);	
%>
X1=-<%=b%>+√<%=delta%>
&emsp;
X1= <%=x1%>
<br>
&emsp;&emsp;
   -------------
<br>
&emsp;&emsp;&emsp;
      2*<%=a%>
<br>
<br>
X2=-<%=b%>-√<%=delta%>
&emsp;
X2= <%=x2%>
<br>
&emsp;&emsp;
   -------------
<br>
&emsp;&emsp;&emsp;
      2*<%=a%>
<br>
<%	
}
else
{
%>
X1 e X2 não são reais, Delta é menor que zero. Raízes Complexas!
<% 
}
%>


</body>
</html>