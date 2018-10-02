package br.com.prova.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.prova.entidade.Nome;
import br.com.prova.util.Conexao;

public class NomeBD {
	
private Connection connection;
	
	public NomeBD() {
		connection = Conexao.getConnection();
	}
	
	public boolean insert (Nome nome) throws SQLException {
		try {
			

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO NOME (id, nome) values (?, ?)");

			stmt.setInt(1, nome.getId());
			stmt.setString(2, nome.getNome());
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
