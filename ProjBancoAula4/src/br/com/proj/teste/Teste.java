package br.com.proj.teste;

import java.sql.SQLException;

import br.com.proj.dados.ProblemaDB;
import br.com.proj.entidade.Problema;

public class Teste {
	
	public static void main (String[]args) throws SQLException {
		
		Problema problema = new Problema();
		problema.setId(1);
		problema.setNome("Falta de Dados");
		problema.setDescricao("Faltam dados para realizar o cadastro");
		new ProblemaDB().inserir(problema);
	}

}
