package com.engenhariasoftware.apipromocoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engenhariasoftware.apipromocoes.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
