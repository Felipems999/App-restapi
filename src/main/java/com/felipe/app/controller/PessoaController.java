package com.felipe.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.app.models.Pessoa;
import com.felipe.app.repository.PessoaRespository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRespository pessoaRepository;

	// Metodos GET

	@GetMapping(value = "/get")
	public List<Pessoa> getPessoas() {
		return pessoaRepository.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<Pessoa> getPessoa(@PathVariable("id") Long id) {
		return pessoaRepository.findById(id);
	}

	// Metodos POST

	@PostMapping("/post")
	public void postPessoa(@RequestBody Pessoa pessoa) {
		if (!(pessoaRepository.existsById(pessoa.getId())))
			pessoaRepository.save(pessoa);
	}

	// Metodos PUT

	@PutMapping("/put/{pessoa}")
	public void putPessoa(@PathVariable("pessoa") Pessoa pessoa) {
		pessoaRepository.deleteById(pessoa.getId());
		pessoaRepository.save(pessoa);
	}

	// Metodos DELETE

	@DeleteMapping("/delete/{id}")
	public void deletePessoa(@PathVariable("id") Long id) {
		pessoaRepository.deleteById(id);
	}

}
