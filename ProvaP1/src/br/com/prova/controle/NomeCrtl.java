package br.com.prova.controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.prova.dados.NomeBD;
import br.com.prova.entidade.Nome;


@WebServlet("/NomeCrtl")
public class NomeCrtl extends HttpServlet {
	
	private static final long serialVersionUID = -1399713870856376270L;

    public NomeCrtl() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nomereal = request.getParameter("nome");
		String msg = "";
		
		Nome nome = new Nome();
		nome.setId(id);
		nome.setNome(nomereal);
		
		try {
			if(new NomeBD().insert(nome)) {
				msg = "Registro inserido com sucesso!";
			}else {
				msg = "Erro ao inserir registro!";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("Cadastro.jsp").forward(request, response);

		
	}

}
