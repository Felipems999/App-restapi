package com.felipe.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.app.models.Tarefa;
import com.felipe.app.repository.TarefaRepository;

@RestController
public class TarefaController {

	private TarefaRepository tarefaRepository = new TarefaRepository();

	@GetMapping("/get/tarefas")
	public List<Tarefa> getTarefas() {
		return tarefaRepository.findAll();
	}

}
