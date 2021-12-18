package com.engenhariasoftware.apipromocoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engenhariasoftware.apipromocoes.domain.Loja;

public interface LojaRepository extends JpaRepository<Loja, Integer> {

}
