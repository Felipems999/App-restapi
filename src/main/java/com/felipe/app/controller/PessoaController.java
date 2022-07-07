package com.felipe.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.app.models.Pessoa;
import com.felipe.app.repository.PessoaRespository;

@RestController
public class PessoaController {

	@Autowired
	private PessoaRespository pessoaRepositry = new PessoaRespository();

	@GetMapping("/get/pessoas")
	public List<Pessoa> getPessoas() {
		return pessoaRepositry.findAll();
	}

	@GetMapping("/get/pessoas/{id}")
	public Pessoa getPessoa(@PathVariable("id") int id) {
		return pessoaRepositry.getById(id);
	}

}
