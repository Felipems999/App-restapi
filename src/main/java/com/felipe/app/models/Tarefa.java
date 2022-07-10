package com.felipe.app.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private Date prazo;
	private String departamento;
	private String duracao;
	private Long pessoaAlocada;
	private boolean isFinalizada;

	public Tarefa() {

	}

	public Tarefa(Long id, String titulo, String descricao, Date prazo, String departamento, String duracao,
			Long pessoaAlocada, boolean isFinalizada) {

		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.prazo = prazo;
		this.departamento = departamento;
		this.duracao = duracao;
		this.pessoaAlocada = pessoaAlocada;
		this.isFinalizada = isFinalizada;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Long getPessoaAlocada() {
		return pessoaAlocada;
	}

	public void setPessoaAlocada(Long pessoaAlocada) {
		this.pessoaAlocada = pessoaAlocada;
	}

	public boolean isFinalizada() {
		return isFinalizada;
	}

	public void setIsFinalizada(boolean isFinalizada) {
		this.isFinalizada = isFinalizada;
	}

}
