package com.projcontrolelocacaocarro.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_funcionario")
public class Funcionario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1783126208701758800L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	private String cidade;
	private String estado;
	private String nomepai;
	private String nomemae;
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNomepai() {
		return nomepai;
	}
	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}
	public String getNomemae() {
		return nomemae;
	}
	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}

}
