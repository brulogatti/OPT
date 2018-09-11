package br.com.projaula3.controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projaula3.dados.FuncionarioBD;
import br.com.projaula3.entidade.Funcionario;


@WebServlet("/FuncionarioCtrl")
public class FuncionarioCtrl extends HttpServlet {
	
	private static final long serialVersionUID = -5659481590803112071L;


	public FuncionarioCtrl() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String msg = "";
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(id);
		funcionario.setNome(nome);
		funcionario.setTelefone(telefone);
		
		try {
			if(new FuncionarioBD().insert(funcionario)) {
				msg = "Registro inserido com sucesso!";
			}else {
				msg = "Erro ao inserir registro!";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("CadastroFuncionario.jsp").forward(request, response);

		
	}

}
