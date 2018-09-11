package br.com.revista.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.revista.entidade.Revista;
import br.com.revista.util.Conexao;

public class RevistaBD {
	
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public RevistaBD() {
		connection = Conexao.getConnection();
	}

	public boolean inserir(Revista revista) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO REVISTA (id, nome, ano, mes, qtdpg) values (?, ?, ?, ?, ?)");

			stmt.setInt(1, revista.getId());
			stmt.setString(2, revista.getNome());
			stmt.setInt(3, revista.getAno());
			stmt.setString(4, revista.getMes());
			stmt.setInt(5, revista.getQtdpg());
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
