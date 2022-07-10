package com.felipe.app.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import com.felipe.app.repository.TarefaRepository;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String departamento;
	@Autowired
	@Transient
	private TarefaRepository listaTarefas;

	public Pessoa() {

	}

	public Pessoa(Long id, String nome, String departamento) {

		this.id = id;
		this.nome = nome;
		this.departamento = departamento;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<Tarefa> listaTarefas() {
		List<Tarefa> lista = new ArrayList<Tarefa>();

		for (Tarefa tarefa : listaTarefas.findAll()) {
			if (tarefa.getId() == this.id) {
				lista.add(tarefa);
			}
		}

		return lista;

	}

}
