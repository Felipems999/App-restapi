package com.felipe.app.models;

import java.util.List;

public class Pessoa {
	private int id;
	private String nome;
	private String departamento;
	private List<Tarefa> listaTarefas;

	public Pessoa() {

	}

	public Pessoa(int id, String nome, String departamento, List<Tarefa> listaTarefas) {

		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
		this.listaTarefas = listaTarefas;

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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public List<Tarefa> getListaTarefas() {
		return listaTarefas;
	}

	public void setListaTarefas(List<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}

}
