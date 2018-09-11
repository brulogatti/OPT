package br.com.cadastro.controle;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastro.dados.PessoaBD;
import br.com.cadastro.entidade.Pessoa;



@WebServlet("/PessoaCtrl")
public class PessoaCtrl extends HttpServlet {
       
	private static final long serialVersionUID = -4495468118325307774L;


	public PessoaCtrl() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int cont=0;
		String tipopessoa = request.getParameter("pessoa");
		String cpfcnpj = request.getParameter("cpfcnpj");
		String nome = request.getParameter("nome");
		String dtnascimento = request.getParameter("dtnasc");
		String endereco = request.getParameter("dtnasc");
		String complemento = request.getParameter("complemento");
		String cidade = request.getParameter("cidade");
	    String estado = request.getParameter("estado");
		String cep = request.getParameter("cep");
		String email = request.getParameter("email");
		String confemail = request.getParameter("confemail");
		String emailfinal = null;
		if (email.equals(confemail)) {
			emailfinal = email;
			cont=1;
		}
		else {
			System.out.println("E-mail inválido");
		}
		String senha = request.getParameter("senha");
		String msg = "";
		
		if(cont==1) {
		Pessoa pessoa = new Pessoa();
		pessoa.setCep(cep);
		pessoa.setCidade(cidade);
		pessoa.setComplemento(complemento);
		pessoa.setCpfcnpj(cpfcnpj);
		pessoa.setDtnascimento(dtnascimento);
		pessoa.setEmail(emailfinal);
		pessoa.setEndereco(endereco);
		pessoa.setEstado(estado);
		pessoa.setNome(nome);
		pessoa.setSenha(senha);
		pessoa.setTipopessoa(tipopessoa);
		cont=0;
		
		try {
			if(new PessoaBD().insert(pessoa)) {
				msg = "Registro inserido com sucesso!";
			}else {
				msg = "Erro ao inserir registro!";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("CadastroPessoa.jsp").forward(request, response);
		}
	}

}
