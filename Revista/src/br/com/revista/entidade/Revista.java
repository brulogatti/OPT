package br.com.revista.entidade;

public class Revista {
	
	private int id;
	private String nome;
	private int ano;
	private String mes;
	private int qtdpg;
	
	
	
	public Revista(int id, String nome, int ano, String mes, int qtdpg) {
		this.id=id;
		this.nome=nome;
		this.ano=ano;
		this.mes=mes;
		this.qtdpg=qtdpg;
	}
	
	public Revista() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getQtdpg() {
		return qtdpg;
	}
	public void setQtdpg(int qtdpg) {
		this.qtdpg = qtdpg;
	}
	
	

}
