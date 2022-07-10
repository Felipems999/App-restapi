package com.felipe.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.app.models.Pessoa;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Long> {

}
