package br.com.proj.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.proj.entidade.Problema;
import br.com.proj.util.Conexao;

public class ProblemaDB {
	
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public ProblemaDB() {
		connection = Conexao.getConnection();
	}

	public boolean inserir(Problema problema) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO PROBLEMA (descricao, nome) values (?, ?)");

			stmt.setString(1, problema.getDescricao());
			stmt.setString(2, problema.getNome());
			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}
	
	public boolean alterar(Problema problema) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("UPDATE PROBLEMA SET descricao = ?, nome = ? WHERE id = ?");

			stmt.setString(1, problema.getDescricao());
			stmt.setString(2, problema.getNome());
            stmt.setInt(3, problema.getId());
            
			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}

	public List<Problema> getAll() {

		List<Problema> lstProblema = new ArrayList<>();
		try {
			ps = this.connection.prepareStatement("SELECT id, descricao, nome FROM PROBLEMA");
			rs = ps.executeQuery();

			while (rs.next()) {
				lstProblema.add(new Problema(rs.getInt("id"), rs.getString("descricao"), rs.getString("nome")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lstProblema;
	}
	
	public boolean excluir(int id) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("DELETE FROM PROBLEMA WHERE ID =?");

			stmt.setInt(1, id);

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
