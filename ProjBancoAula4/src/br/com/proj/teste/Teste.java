package br.com.proj.teste;

import java.sql.SQLException;

import br.com.proj.dados.ProblemaDB;
import br.com.proj.entidade.Problema;
import br.com.proj.util.Conexao;

public class Teste {
	
	public static void main (String[]args) throws SQLException {
		
		/*System.out.println("Início");
		Conexao.getConnection();
		System.out.println("Fim");*/
		
		Problema problema = new Problema();
		problema.setNome("Falta de Dados");
		problema.setDescricao("Faltam dados para realizar o cadastro");
		
		if(new ProblemaDB().inserir(problema)) {
			System.out.println("Problema inserido");
		}else {
			System.out.println("Problema ao inserir registro");
		}
		
	}

}
