package br.com.revista.controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.revista.dados.RevistaBD;
import br.com.revista.entidade.Revista;


/**
 * Servlet implementation class RevistaCtrl
 */
@WebServlet("/RevistaCtrl")
public class RevistaCtrl extends HttpServlet {
       
	/**
	 * 
	 */
	private static final long serialVersionUID = 2456812134065540773L;


	public RevistaCtrl() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		int ano = Integer.parseInt(request.getParameter("ano"));
		String mes = request.getParameter("mes");
		int qtdpg = Integer.parseInt(request.getParameter("qtdpg"));
		String msg = "";
		
		Revista revista = new Revista();
		revista.setId(id);
		revista.setAno(ano);
		revista.setMes(mes);
		revista.setNome(nome);
		revista.setQtdpg(qtdpg);
		
		
		try {
			if(new RevistaBD().inserir(revista)) {
				msg = "Registro inserido com sucesso!";
			}else {
				msg = "Erro ao inserir registro!";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("CadastroRevista.jsp").forward(request, response);
	}

}
