package com.felipe.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.felipe.app.models.Pessoa;

@Repository
public class PessoaRespository {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public PessoaRespository() {

		this.pessoas.add(new Pessoa(1, "Felipe", "Logística", null));
		this.pessoas.add(new Pessoa(2, "Pedro", "RH", null));

	}

	public List<Pessoa> findAll() {
		return pessoas;
	}

	public Pessoa getById(int id) {

		for (Pessoa p : pessoas) {
			if (p.getId() == id) {
				return p;
			}
		}

		return null;

	}

	public void savePessoa(Pessoa pessoa) {

		if (pessoas.contains(pessoa)) {
			System.out.println("Pessoa com a mesma id");
		} else {
			pessoas.add(pessoa);
		}

	}

}
