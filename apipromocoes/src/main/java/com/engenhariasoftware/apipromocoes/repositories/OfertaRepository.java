package com.engenhariasoftware.apipromocoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engenhariasoftware.apipromocoes.domain.Oferta;

public interface OfertaRepository extends JpaRepository<Oferta, Integer> {

}
