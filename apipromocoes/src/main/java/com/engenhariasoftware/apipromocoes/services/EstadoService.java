package com.engenhariasoftware.apipromocoes.services;

import java.util.List;

import com.engenhariasoftware.apipromocoes.domain.Estado;

public interface EstadoService {

	Estado findById(Integer id);
	List<Estado> findAll();
	
}
