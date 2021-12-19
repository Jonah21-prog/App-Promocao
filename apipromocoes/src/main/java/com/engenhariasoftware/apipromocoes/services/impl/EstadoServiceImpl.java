package com.engenhariasoftware.apipromocoes.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engenhariasoftware.apipromocoes.domain.Estado;
import com.engenhariasoftware.apipromocoes.repositories.EstadoRepository;
import com.engenhariasoftware.apipromocoes.services.EstadoService;
import com.engenhariasoftware.apipromocoes.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private EstadoRepository repository;

	@Override
	public Estado findById(Integer id) {
		Optional<Estado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
