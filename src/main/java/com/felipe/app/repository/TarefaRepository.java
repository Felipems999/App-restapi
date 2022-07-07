package com.felipe.app.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.felipe.app.models.Pessoa;
import com.felipe.app.models.Tarefa;

@Repository
public class TarefaRepository {

	private List<Tarefa> tarefas = new ArrayList<Tarefa>();

	public TarefaRepository() {
		this.tarefas.add(new Tarefa(1, "Alguma coisa", "Fazer alguma coisa", new Date(2011), "Logistica", "20h",
				new Pessoa(1, "Felipe", "Logistica", null), true));
		this.tarefas.add(new Tarefa(2, "Algo", "Fazer algo", new Date(2012), "RH", "12h",
				new Pessoa(1, "Pedro", "RH", null), false));
	}

	public List<Tarefa> findAll() {
		return this.tarefas;
	}

	public Tarefa getByid(int id) {

		for (Tarefa t : tarefas) {
			if (t.getId() == id) {
				return t;
			}
		}

		return null;
	}
}
