package br.com.cadastro.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cadastro.entidade.Pessoa;
import br.com.cadastro.util.Conexao;

public class PessoaBD {
	
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public PessoaBD() {
		connection = Conexao.getConnection();
	}
	
	public boolean insert (Pessoa pessoa) throws SQLException {
		try {
			

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO CADASTRO (tipopessoa, cpfcnpj, nome, dtnascimento, email, cep, endereco, complemento, cidade, estado, senha) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			stmt.setString(1, pessoa.getTipopessoa());
			stmt.setString(2, pessoa.getCpfcnpj());
			stmt.setString(3, pessoa.getNome());
			stmt.setString(4, pessoa.getDtnascimento());
			stmt.setString(5, pessoa.getEmail());
			stmt.setString(6, pessoa.getCep());
			stmt.setString(7, pessoa.getEndereco());
			stmt.setString(8, pessoa.getComplemento());
			stmt.setString(9, pessoa.getCidade());
			stmt.setString(10, pessoa.getEstado());
			stmt.setString(11, pessoa.getSenha());
			stmt.execute();
			return true;
			

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}
}


