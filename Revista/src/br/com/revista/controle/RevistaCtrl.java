package br.com.revista.controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.revista.dados.RevistaBD;
import br.com.revista.entidade.Consulta;
import br.com.revista.entidade.Revista;


/**
 * Servlet implementation class RevistaCtrl
 */
@WebServlet("/RevistaCtrl")
public class RevistaCtrl extends HttpServlet {
	
	private static final long serialVersionUID = -6243352998323331866L;
    
	public RevistaCtrl() {
       
    }

	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			     
	}*/

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("id");
		String nome = request.getParameter("nome");
		String ANO = request.getParameter("ano");
		String mes = request.getParameter("mes");
		String QTPG = request.getParameter("qtdpg");
		String msg = "";
		
		boolean vr1=false,vr2=false,vr3=false;
		boolean vr4=false,vr5=false,vr6=false;
		
		
		//Insert
		if((ID.isEmpty())||(nome.isEmpty())||(ANO.isEmpty())||(mes.isEmpty())||(QTPG.isEmpty())){
			JOptionPane.showMessageDialog(null,"Erro...Algum campo pode estar vazio...!!!");
			 request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
		}else{
		    if((ID.matches("^[a-zA-Z��������������������������]*$"))){
		    	JOptionPane.showMessageDialog(null,"Erro...Código Informado Incorretamente...!!!");
				request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
		        vr1=false;
		    }else{	
				vr1=true;
		    }	
		    
		    if((ANO.matches("^[a-zA-Z��������������������������]*$"))){
				JOptionPane.showMessageDialog(null,"Erro...Ano Informado Incorretamente...!!!");
				request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
				vr2=false;
		    }else{
		    	vr2=true;
			}	
					
		    if((QTPG.matches("^[a-zA-Z��������������������������]*$"))){
		    	JOptionPane.showMessageDialog(null,"Erro...Quantidade de P�ginas Informado Incorretamente...!!!");
			    request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
				vr3=false;
		    }else{
		    	vr3=true;
		    }
		        
		    
		   if((vr1==true)&&(vr2==true)&&(vr3==true)){
			
			int id=Integer.parseInt(ID);
			int ano=Integer.parseInt(ANO);
			int qtdpg=Integer.parseInt(QTPG);
			
			if(nome.length()>7){
				vr4=true;
			}else{
				JOptionPane.showMessageDialog(null,"Erro...Nome requer no mínimo 7 caracteres...!!");
			}
			
			if(ano<=2018){
				vr5=true;
			}else{
				JOptionPane.showMessageDialog(null,"Erro...Ano não corresponde a um Ano válido...!!");
			}
			
			if(qtdpg>20){
				vr6=true;
			}else{
				JOptionPane.showMessageDialog(null,"Erro...Quantidade de Páginas da Revista é Insuficiente...!!");
			}
		
			if((vr4==true)&&(vr5==true)&&(vr6==true) ){
		       
				Revista revista = new Revista();
				
				revista.setId(id);
				revista.setNome(nome);
				revista.setAno(ano);
				revista.setMes(mes);
				revista.setQtdpg(qtdpg);
		      
				try {
			       
		    	   if(new RevistaBD().inserir(revista)) {
				      msg = "Registro Inserido com Sucesso!";
			       
		    	    }else {
				      msg = "Erro ao Inserir Registro!";
			        }
		
		        } catch (SQLException e) {
			          e.printStackTrace();
		        }
		
		        request.setAttribute("msg", msg);
		        JOptionPane.showMessageDialog(null,msg);
		        request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
	  
		   }else{
			   JOptionPane.showMessageDialog(null,"Erro...Dados não podem ser Registrados no Banco de Dados...!!");
		 	   request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
		 }
	   }
		
		//Select
	 }
	}
   }