package br.com.projaula3.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.projaula3.util.Conexao;
import br.com.projaula3.entidade.Funcionario;

public class FuncionarioBD {
	
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public FuncionarioBD() {
		connection = Conexao.getConnection();
	}
	
	public boolean insert (Funcionario funcionario) throws SQLException {
		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO AULA3 (id, nome, telefone) values (?, ?, ?)");

			stmt.setInt(1, funcionario.getId());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getTelefone());
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
