package com.felipe.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.app.models.Tarefa;
import com.felipe.app.repository.TarefaRepository;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	private TarefaRepository tarefaRepository;

	// Metodos GET

	@GetMapping("/get")
	public List<Tarefa> getTarefas() {
		return tarefaRepository.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<Tarefa> getTarefa(@PathVariable("id") Long id) {
		return tarefaRepository.findById(id);
	}

	// Metodos POST

	@PostMapping("/post")
	@ResponseStatus(value = HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
	public void postTarefa(@RequestBody Tarefa tarefa) {
		if (!(tarefaRepository.existsById(tarefa.getId())))
			tarefaRepository.save(tarefa);
	}

	// Metodos PUT

	// Metodos DELETE

}
