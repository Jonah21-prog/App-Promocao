package com.engenhariasoftware.apipromocoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engenhariasoftware.apipromocoes.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
